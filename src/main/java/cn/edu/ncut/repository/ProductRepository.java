package cn.edu.ncut.repository;

import cn.edu.ncut.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2018/5/15.
 *
 * @author Ocean lin
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
