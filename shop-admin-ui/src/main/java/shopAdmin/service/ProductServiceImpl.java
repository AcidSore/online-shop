package shopAdmin.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persist.model.Product;
import persist.repo.ProductRepository;
import shopAdmin.controllers.repr.ProductRepr;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements  Serializable {
    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Transactional
    public List<ProductRepr> findAll() {
        return productRepository.findAll().stream()
                .map(ProductRepr::new)
                .collect(Collectors.toList());
    }


    @Transactional
    public ProductRepr findById(Long id) {
        return new ProductRepr(productRepository.findById(id).get());
    }


    @Transactional
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }



        @Transactional
        public void save(ProductRepr productRepr) throws IOException {
            Product product = (productRepr.getId() != null) ? productRepository.findById(productRepr.getId()).get()
                    : new Product();
            product.setTitle(productRepr.getName());
            product.setCategory(productRepr.getCategory());
            product.setBrand(productRepr.getBrand());
            product.setPrice(productRepr.getPrice());
            productRepository.save(product);
        }


}
