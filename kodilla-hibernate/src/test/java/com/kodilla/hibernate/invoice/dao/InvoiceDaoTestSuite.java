package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("Apple");
        Product orange = new Product("Orange");
        Product watermelon = new Product("watermelon");
        Product lemon = new Product("lemon");

        Item itemApples = new Item(apple, new BigDecimal("1.25"), 5);
        Item itemOranges = new Item(orange, new BigDecimal("1.5"), 2);
        Item itemWatermelon = new Item(watermelon, new BigDecimal("15"), 1);
        Item itemLemon = new Item(lemon, new BigDecimal("2"), 7);

        Invoice invoice = new Invoice("FV 3/7/2020");
        invoice.getItems().add(itemApples);
        invoice.getItems().add(itemOranges);
        invoice.getItems().add(itemWatermelon);
        invoice.getItems().add(itemLemon);

        itemApples.setInvoice(invoice);
        itemApples.setProduct(apple);
        itemOranges.setInvoice(invoice);
        itemOranges.setProduct(orange);
        itemWatermelon.setInvoice(invoice);
        itemWatermelon.setProduct(watermelon);
        itemLemon.setInvoice(invoice);
        itemLemon.setProduct(lemon);

        //When
        itemDao.save(itemApples);
        itemDao.save(itemLemon);
        itemDao.save(itemOranges);
        itemDao.save(itemWatermelon);
        int idItemApples = itemApples.getId();
        int idItemLemon = itemLemon.getId();
        int idItemOranges = itemOranges.getId();
        int idItemWatermelon = itemWatermelon.getId();

        //Then
        Assert.assertNotEquals(0, idItemApples);
        Assert.assertNotEquals(0, idItemLemon);
        Assert.assertNotEquals(0, idItemOranges);
        Assert.assertNotEquals(0, idItemWatermelon);

        //CleanUp
        try {
            itemDao.deleteById(idItemApples);
            itemDao.deleteById(idItemLemon);
            itemDao.deleteById(idItemOranges);
            itemDao.deleteById(idItemWatermelon);
        } catch (Exception e) {
            //do nothing
        }
    }
}

