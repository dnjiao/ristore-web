/**
 * 
 */
package org.mdacc.ristore.ws.fm.service;

import java.util.List;

import org.mdacc.ristore.ws.fm.models.FmTrfTb;

/**
 * @author djiao
 *
 */
public interface FmTrfService {
	public void saveTrfs(List<String> trfs, String source);

}
