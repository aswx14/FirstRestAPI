package com.afreen.firstrestapi.product.repository;

public class OldProductRepository {
}
//package com.afreen.firstrestapi.product.repository;
//import org.springframework.stereotype.Repository;
//import com.afreen.firstrestapi.product.domain.Product;
//import java.util.List;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//
//
//@Repository
//public class ProductRepository {
//    protected final Map <Long, Product> map = new HashMap<>();
//    protected long counter = 1;
//    public Product save(Product entity){
//        setId(entity);
//        return entity;
//    }
//    private Product setId(Product entity){
//        if (entity.getId() != null){
//            map.put(entity.getId(), entity);
//        } else{
//            entity.setId(counter);
//            map.put(counter, entity);
//            counter++;
//        }
//        return entity;
//    }
//    public Optional<Product> findById(Long id){
//        return Optional.ofNullable(map.get(id));
//    }
//    public List <Product> findAll(){
//        return new ArrayList<>(map.values());
//    }
//    public void deleteById(Long id){
//        map.remove(id);
//    }
//}
