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

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("Apple");
        Product orange = new Product("Orange");
        Product watermelon = new Product("watermelon");
        Product lemon = new Product("lemon");

        Item item_apples = new Item(apple, new BigDecimal("1.25"), 5);
        Item item_oranges = new Item(orange, new BigDecimal("1.5"), 2);
        Item item_watermelon = new Item(watermelon, new BigDecimal("15"), 1);
        Item item_lemon = new Item(lemon, new BigDecimal("2"), 7);

        Invoice invoice = new Invoice("FV 3/7/2020");
        invoice.getItems().add(item_apples);
        invoice.getItems().add(item_oranges);
        invoice.getItems().add(item_watermelon);
        invoice.getItems().add(item_lemon);

        item_apples.setInvoice(invoice);
        item_oranges.setInvoice(invoice);
        item_watermelon.setInvoice(invoice);
        item_lemon.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
//        try {
//            invoiceDao.deleteById(id);
//        } catch (Exception e) {
//            //do nothing
//        }
    }
}
