package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Dao.InvoiceDao;
import com.kodilla.hibernate.invoice.Dao.ItemDao;
import com.kodilla.hibernate.invoice.Dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.hibernate.SessionFactory;
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
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;
    private static SessionFactory sessionFactory;

    @Test
    public void testItemDaoSaveWithProduct() {
        //Given
        Product petrolRegularUnleaded = new Product("Petrol Regular Unleaded");
        Product dieselRegular = new Product("Diesel Regular");

        Item item1 = new Item(petrolRegularUnleaded, new BigDecimal(1.23), 100);
        Item item2 = new Item(dieselRegular, new BigDecimal(0.99), 20);

        petrolRegularUnleaded.getItems().add(item1);
        dieselRegular.getItems().add(item2);

        item1.setProduct(petrolRegularUnleaded);
        item2.setProduct(dieselRegular);

        //When

        productDao.save(petrolRegularUnleaded);
        productDao.save(dieselRegular);

        int item1ID = item1.getId();
        int item2ID = item2.getId();

        //Then
        Assert.assertNotEquals(0, item1ID);
        Assert.assertNotEquals(0, item2ID);

        //Clean-up
        productDao.delete(petrolRegularUnleaded);
        productDao.delete(dieselRegular);
    }

    @Test
    public void testInvoiceDaoSave() {

        //Given

        Product petrolRegularUnleaded = new Product("Petrol Regular Unleaded");
        Product dieselRegular = new Product("Diesel Regular");

        Item item1 = new Item(petrolRegularUnleaded, new BigDecimal(1.23), 100);
        Item item2 = new Item(dieselRegular, new BigDecimal(0.99), 20);

        Invoice invoice1 = new Invoice("FV2017/01");

        petrolRegularUnleaded.getItems().add(item1);
        dieselRegular.getItems().add(item2);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        //When
        invoiceDao.save(invoice1);

        int invoiceId = invoice1.getId();
        String productName = invoice1.getItems().get(0).getProduct().getName();

        //Then
        Assert.assertNotEquals(0,invoiceId);
        Assert.assertEquals("Petrol Regular Unleaded", productName);

        //Clean-up;
        invoiceDao.delete(invoice1);
    }
}
