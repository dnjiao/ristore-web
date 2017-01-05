/**
 * 
 */
package org.mdacc.ristore.ws.fm.service;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mdacc.ristore.ws.RistoreWebApplication;
import org.mdacc.ristore.ws.fm.models.FmTrfTb;
import org.mdacc.ristore.ws.fm.repository.FmTrfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author djiao
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RistoreWebApplication.class, initializers = ConfigFileApplicationContextInitializer.class)
@WebAppConfiguration
public class FmTrfServiceBeanTest {

	@Autowired
	private FmTrfRepository trfRepository;
	 
	@Test
	public void testSaveTrfs() {
		Date date = new Date();
		FmTrfTb trf = new FmTrfTb();
		trf.setTrf("XXX0001");
		trf.setSourceSystem("SARC");
		trf.setInsertTs(date);
		trf.setUpdateTs(date);
		assertEquals(0, trf.getRowId());
        trfRepository.save(trf);
        assertTrue(trf.getRowId() > 0);
	}

}
