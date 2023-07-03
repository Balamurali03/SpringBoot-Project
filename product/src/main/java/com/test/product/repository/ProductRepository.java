package com.test.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.product.entity.Products;

public interface ProductRepository extends JpaRepository<Products,String> 
{  @Query(value="SELECT  * FROM Products INNER JOIN Categories  ON  Products.category_id =Categories.categoryid where categoryname= :category ", nativeQuery = true)
  public List<Products> getbycategory(String category );
@Query(value="SELECT  * FROM Products INNER JOIN Categories  ON  Products.category_id =Categories.categoryid where price= :price ", nativeQuery = true)
public List<Products> getbyprice(int price );
}
