
public class CamaroteSuperior extends Vip {
float valor_adcional = 40;
public float retornaValor() {
	float x = valorVip();
	return (x + valor_adcional);
}
}
