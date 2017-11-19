package chapter_5_5;

public class Office {

	private PrinterInterface printer;
	
	public void setPrinter(PrinterInterface printer) {
		this.printer = printer;
	}
	
	public void print(String detail) {
		printer.print(detail);
	}
}
