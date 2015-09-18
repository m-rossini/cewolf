package de.laures.cewolf.taglib.util;

import java.util.List;

import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.TaskSeries;
import java.util.Iterator;

public class AlturaDinamicaAusterCiclos{
	
	
	private static final int ALTURA_HEADER = 21;
	private static final int ALTURA_SUBHEADER = 23;
	private static final int ALTURA_LINHA = 32;
	private IntervalCategoryDataset ds;
	private List listTaskSeries;
	private int height;
	
	
	public AlturaDinamicaAusterCiclos(Object ds){
		
		this.ds = (IntervalCategoryDataset) ds;
		
		//System.out.println(this.ds.getRowKeys().size());
		
		int contador = 0;
		this.listTaskSeries = this.ds.getRowKeys();
		Iterator it = this.listTaskSeries.iterator();
		while(it.hasNext()){
			TaskSeries ts = (TaskSeries) it.next();
			contador = ts.getItemCount();
		}
		
		this.height = ALTURA_HEADER + 
			ALTURA_SUBHEADER + ( contador * ALTURA_LINHA ) + 1;
		
	}
	
	public int getAltura(){
		return this.height;
	}
	
	
	
	
}