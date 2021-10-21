package br.com.camargos.response;

import java.io.Serializable;
import java.util.Objects;


/**
 *  cambio
 *
 */
public class Cambio implements Serializable {

	private static final long serialVersionUID = 1L;


	private long id;
	private String from;
	private String to;
	private Double conversionFactor;
	private Double convertedValue;
	private String environment;

	public Cambio() {
	}

	public Cambio(long id, String from, String to, Double conversionFactor, Double convertedValue, String environment) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.convertedValue = convertedValue;
		this.environment = environment;
	}



	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Cambio))
			return false;
		Cambio cambio = (Cambio) o;
		return getId() == cambio.getId() && Objects.equals(getFrom(), cambio.getFrom()) && Objects.equals(getTo(), cambio.getTo()) && Objects.equals(getConversionFactor(), cambio.getConversionFactor()) && Objects.equals(getConvertedValue(), cambio.getConvertedValue()) && Objects.equals(getEnvironment(), cambio.getEnvironment());
	}

	@Override public int hashCode() {
		return Objects.hash(getId(), getFrom(), getTo(), getConversionFactor(), getConvertedValue(), getEnvironment());
	}

	/**
	 * get field
	 *
	 * @return id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * set field
	 *
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * get field
	 *
	 * @return from
	 */
	public String getFrom() {
		return this.from;
	}

	/**
	 * set field
	 *
	 * @param from
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * get field
	 *
	 * @return to
	 */
	public String getTo() {
		return this.to;
	}

	/**
	 * set field
	 *
	 * @param to
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * get field
	 *
	 * @return conversionFactor
	 */
	public Double getConversionFactor() {
		return this.conversionFactor;
	}

	/**
	 * set field
	 *
	 * @param conversionFactor
	 */
	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	/**
	 * get field
	 *
	 * @return convertedValue
	 */
	public Double getConvertedValue() {
		return this.convertedValue;
	}

	/**
	 * set field
	 *
	 * @param convertedValue
	 */
	public void setConvertedValue(Double convertedValue) {
		this.convertedValue = convertedValue;
	}

	/**
	 * get field
	 *
	 * @return environment
	 */
	public String getEnvironment() {
		return this.environment;
	}

	/**
	 * set field
	 *
	 * @param environment
	 */
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
}
