package sincronizacion;

import java.util.Random;

public class GenerarNumero implements Runnable {
	
	Buffer buf;
	
	public void setBuf(Buffer buf) {
		this.buf = buf;
	}
	
	@Override
	public void run() {
		Random rn = new Random();
		while(true) {
			buf.setNumero(rn.nextInt());
		}
	}

}
