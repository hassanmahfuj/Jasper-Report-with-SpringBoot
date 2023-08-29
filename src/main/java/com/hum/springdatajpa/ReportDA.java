package com.hum.springdatajpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReportDA {

	public List<Product> productReport() {
		List<Product> l = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_sense", "root", "nh123456");
			PreparedStatement pst = con
					.prepareStatement("SELECT product_id, title, regular_price, sale_price, stock_count FROM products");
			ResultSet rs = pst.executeQuery();
			Product p;
			while (rs.next()) {
				p = new Product();
				p.setProductId(rs.getInt(1));
				p.setTitle(rs.getString(2));
				p.setRegularPrice(rs.getDouble(3));
				p.setSalePrice(rs.getDouble(4));
				p.setStockCount(rs.getInt(5));
				l.add(p);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return l;
	}

}
