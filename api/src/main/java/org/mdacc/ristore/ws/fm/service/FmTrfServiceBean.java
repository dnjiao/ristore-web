package org.mdacc.ristore.ws.fm.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.mdacc.ristore.ws.fm.models.FmTrfTb;
import org.mdacc.ristore.ws.fm.repository.FmTrfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author djiao
 *
 */
@Service
public class FmTrfServiceBean implements FmTrfService {

	@Autowired
	FmTrfRepository fmTrfRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveTrfs(List<String> trfs, String source) {
		Date date = new Date();
		for (String trf : trfs) {
			FmTrfTb fmTrfTb = new FmTrfTb();
			fmTrfTb.setTrf(trf);
			fmTrfTb.setSourceSystem(source);
			BigDecimal etl = getNextValue("ETL_PROC_SEQ");
			fmTrfTb.setEtlProcId(etl);
			fmTrfTb.setInsertTs(date);
			fmTrfTb.setUpdateTs(date);
			fmTrfRepository.save(fmTrfTb);
		}
	}

	/**
	 * Get next value in sequence
	 * @param seq - sequence name in db
	 * @return
	 */
	private BigDecimal getNextValue(String seq) {
		String query = "SELECT " + seq + ".nextval from DUAL";
		Query q = em.createNativeQuery(query);		
		BigDecimal val = (BigDecimal)q.getSingleResult();
		return val;
	}
	

}
