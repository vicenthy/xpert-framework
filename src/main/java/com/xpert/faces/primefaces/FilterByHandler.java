package com.xpert.faces.primefaces;

import com.xpert.persistence.query.Restrictions;

/**
 * Handler to LazyDataModelImpl filtering
 * 
 * @author ayslan
 */
public interface FilterByHandler {
    
    public Restrictions getFilterBy(String property, Object value);
    
}
