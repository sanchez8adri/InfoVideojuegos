import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InfoVideojuegos implements CalculadoraPrecio {

	public static void main(String[] args) throws IOException {


		List<Videojuego> listaVideojuegos = new ArrayList<>();
		listaVideojuegos.add(new Videojuego("Dark Souls 3", 10000, 5));
		listaVideojuegos.add(new Videojuego("The Last of Us", 50000, 10));
		listaVideojuegos.add(new Videojuego("Fifa 2022", 60000, 15));
		listaVideojuegos.add(new Videojuego("Mario Bros", 45000, 1));
		listaVideojuegos.add(new Videojuego("Doom 2", 100000, 5));
		listaVideojuegos.add(new Videojuego("Horizon", 50000, 5));
		
		CalculadoraPrecio calculadoraPrecio = new InfoVideojuegos();
		
		listaVideojuegos = calculadoraPrecio.calcularPrecio(listaVideojuegos);
		
		File archivo = new File("info_videojuegos.txt");
		FileWriter fw = new FileWriter(archivo);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Videojuego videojuego: listaVideojuegos) {
			bw.write("Videojuego: " +videojuego.getNombre()+" - Juegos Vendidos:" +videojuego.getnVentas()+" - Recaudación total:" +videojuego.getMontoTotal()+"€\n");
		}
		
		bw.close();
		fw.close();

	}

	@Override
	public List<Videojuego> calcularPrecio(List<Videojuego> listaVideojuegos) {

		for(Videojuego videojuego: listaVideojuegos) {
			videojuego.setMontoTotal(videojuego.getPrecio()*videojuego.getnVentas());
		}
		
		
		return listaVideojuegos;
	}

}
