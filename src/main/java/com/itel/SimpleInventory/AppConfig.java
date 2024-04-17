package com.itel.SimpleInventory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;

@Configuration
public class AppConfig {

    @Bean
    public Map<String, Product> inventory(){

        Map<String, Product> productInventory = new HashMap<>();
        productInventory.put("Acer", new Product("Acer nitro", new BigDecimal(60000), 2L, Category.ELECTRONICS));
        return productInventory;
    }
}