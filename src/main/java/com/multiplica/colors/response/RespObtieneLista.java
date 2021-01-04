package com.multiplica.colors.response;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class RespObtieneLista<T> implements Serializable {

	private Integer count;
	private List<T> items;
	private Integer totalpaginas;
	private Integer paginaActual;
	private Long totalElementos;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
	public Integer getTotalpaginas() {
		return totalpaginas;
	}

	public void setTotalpaginas(Integer totalpaginas) {
		this.totalpaginas = totalpaginas;
	}

	public Integer getPaginaActual() {
		return paginaActual;
	}

	public void setPaginaActual(Integer paginaActual) {
		this.paginaActual = paginaActual;
	}

	public Long getTotalElementos() {
		return totalElementos;
	}

	public void setTotalElementos(Long totalElementos) {
		this.totalElementos = totalElementos;
	}

	@Override
	public String toString() {
		return "RespObtieneLista [" + (count != null ? "count=" + count + ", " : "")
				+ (items != null ? "items=" + items : "") 
				+ (totalpaginas != null ? "totalpaginas=" + count + ", " : "") 
				+ (paginaActual != null ? "paginaActual=" + count + ", " : "") 
				+ (totalElementos != null ? "totalElementos=" + count + ", " : "") + "]";
	}

}
