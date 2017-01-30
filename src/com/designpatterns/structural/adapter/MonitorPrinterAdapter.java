package com.designpatterns.structural.adapter;

public class MonitorPrinterAdapter implements Monitor {
	
	Printer printer;
	
	public MonitorPrinterAdapter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void display(String message) {
		printer.print(message);

	}

}
