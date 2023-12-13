package ejercicio4.entities;

import java.text.DateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TB_CONTRATO")
public class Contrato {
	@Id
	@SequenceGenerator(name = "CONTRATOGEN", sequenceName = "CONTRATO_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTRATOGEN")
	private int id;
	@Column(length = 20, nullable = false)
	private String nombreCliente;
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_INICIO", nullable = false)
	private Date fechaInicio;
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_FIN", nullable = false)
	private Date fechaFin;
	@Column(length = 20, nullable = false)
	private int importe;

	public Contrato() {
		super();
	}

	public Contrato(int id, String nombreCliente, Date fechaInicio, Date fechaFin, int importe) {
		super();
		this.id = id;
		this.nombreCliente = nombreCliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.importe = importe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", nombreCliente=" + nombreCliente + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", importe=" + importe + "]";
	}

}
