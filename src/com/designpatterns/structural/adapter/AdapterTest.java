package com.designpatterns.structural.adapter;

public class AdapterTest {
	
	public static void main(String[] args){
		
		
		Monitor ledTV = new LedTV();
		
		Printer printer = new Printer();
		Monitor adapter = new MonitorPrinterAdapter(printer);
		
		String message = "Hello";
		ledTV.display(message );
		adapter.display(message);
	}

}
