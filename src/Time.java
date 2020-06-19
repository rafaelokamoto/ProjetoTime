
public class Time {
	private int hora;
	private int minuto;
	private int segundo;


	public Time(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	public String exibirHoraUniversal() {
		int novaHora = 0;
		int novoMinuto = 0;
		if (this.hora > 23) {
			return "Hora invalida no formato Universal";
		}
		else {
			if (this.minuto>60) {
				novaHora = this.hora + (this.minuto/60) + 12;
				novoMinuto = this.minuto + (this.minuto % 60);
			}
			else {
				if (this.hora < 12) {
					novaHora = this.hora + 12;
					novoMinuto = this.minuto;
				}
				else {
					novaHora = this.hora;
					novoMinuto = this.minuto;
				}
			}
			return "O horario no formato Universal e: "+novaHora+ ":"+novoMinuto+":"+this.segundo;
		}
	}
	public String exibirHoraPadrao() {
		int novaHora = 0;
		int novoMinuto = 0;
		int novoSegundo = 0;
		if (this.hora != 24) {
			if (this.hora > 0 && this.hora < 12) {
				return "O horario no formato padrao e: "+this.hora+":"+this.minuto+":"+this.segundo+ " AM";
			}
			else {
				if (this.minuto>60) {
					novaHora = this.hora + (this.minuto/60) + 12;
					novoMinuto = this.minuto + (this.minuto % 60);
					novoSegundo = this.segundo;
				}
				else {
					if (this.hora == 12 && this.minuto == 0 && this.segundo == 0) {
						novaHora = this.hora;
						novoMinuto = this.minuto;
						novoSegundo = this.segundo;
					}
					else {
						novaHora = this.hora - 12;
						novoMinuto = this.minuto;
						novoSegundo = this.segundo;
					}
				}
				if (minuto < 10) {
					return "O horario no formato padrao e: "+novaHora+ ":"+novoMinuto+"0:"+novoSegundo+"0 PM";
				}
				else {
					return "O horario no formato padrao e: "+novaHora+ ":"+novoMinuto+":"+novoSegundo+ " PM";
				}
			}
		}
		if (this.hora == 24 && this.minuto == 0 && this.segundo == 0) {
			novaHora = this.hora - 12;
			novoMinuto = this.minuto;
			novoSegundo = this.segundo;
			return "O horario no formato padrao e: "+novaHora+ ":"+novoMinuto+"0:"+novoSegundo+"0 PM";
		}
		return "Horario invalido";
	}
}
