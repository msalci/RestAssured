package com.app.tests;

import java.util.Arrays;

import org.junit.Test;

import com.app.pojos.Car;
import com.google.gson.Gson;

import io.restassured.response.Response;
import io.restassured.RestAssured;

public class CarsTest {

	Gson gson = new Gson();
	
	@Test
	public void CarDeserialization() {
		
		//get the requested json format from the url
		
		Response resp = RestAssured.given().log().all().get("https://brygit24.github.io/liveCoding/cars2.json");
	
		Car[] car = gson.fromJson(resp.asString(), Car[].class);
		resp.prettyPrint();

		//question 1. Blue Tesla validation
		System.out.println("Blue and Tesla Validation :");
	for(int i =0; i<car.length; i++) {
		if(car[i].getMake().equalsIgnoreCase("Tesla")&&car[i].getMetadata().getColor().equalsIgnoreCase("blue")) {
			System.out.println("This is the result of 1.question : "+car[i]);
		}		
	}
		//question 2. return all cars which have lowest perdayrental cost for both cases
			//a. Price only lowest
			//b. Price after discount
	
		long[] prices = new long[8];
		long[] priceAfterDiscount = new long[8];
		
		for(int j =0; j<car.length; j++) {
	prices[j] =	car[j].getPerdayrent().getPrice();
	priceAfterDiscount[j] = prices[j]-(prices[j]*car[j].getPerdayrent().getDiscount()/100);
	
		}
		Arrays.sort(prices);
	Arrays.sort(priceAfterDiscount);
	
	for(int k=0;k<car.length;k++) {
		if(prices[0]==car[k].getPerdayrent().getPrice()) {
			System.out.println(car[k]+" "+prices[0]);
		}
	}
		for(int l=0;l<car.length;l++) {
			if(priceAfterDiscount[0]==(car[l].getPerdayrent().getPrice()-(car[l].getPerdayrent().getPrice()*car[l].getPerdayrent().getDiscount()/100))) {
				System.out.println(car[l]+" "+priceAfterDiscount[0]);
			}
	}
		//question 3 find the highest revenue.
		//year over year maintenance cost + depreciation is the total expense per car for the full year for the rental car company
		//the objective is to find those car that produce highest profit in the last year.
	
		double[] totalexpense = new double[8];
		
		for(int n=0; n<car.length; n++) {
		totalexpense[n] = car[n].getMetrics().getDepreciation()+car[n].getMetrics().getYoymaintenancecost();
		
		}
		
		Arrays.sort(totalexpense);
		for(int q=0; q<car.length;q++) {
			if(totalexpense[0]==car[q].getMetrics().getDepreciation()+car[q].getMetrics().getYoymaintenancecost()) {
				System.out.println(car[q]+" "+totalexpense[0]);
			}
		}
	
	
		
		
	}}