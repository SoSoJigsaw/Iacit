package com.api.BACKEND.IACIT.modal;



import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.type.BigDecimalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "precipitacao")
@Getter
@Setter
@ToString
public class PrecipitacaoModal {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_precipitacao")
	private Integer codPrecipitacao;
	
	@ManyToOne
    @JoinColumn(name = "cod_wmo", referencedColumnName = "cod_wmo")
	private EstacaoModal codWmo;
	
	@Column(name = "precipitacaototal")
	private BigDecimalType precipitacaototal;
	@Column(name= "datahora_captacao",nullable = false)
	private Timestamp datahoraCaptacao;
	

	
	
}