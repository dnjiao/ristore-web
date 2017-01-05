package org.mdacc.ristore.ws.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsServiceImpl implements ClientDetailsService {

	@Override
	public ClientDetails loadClientByClientId(String clientId)
            throws OAuth2Exception {

        if (clientId.equals("ristoreclient")) {

            List<String> authorizedGrantTypes=new ArrayList<String>();
            authorizedGrantTypes.add("password");
            authorizedGrantTypes.add("refresh_token");
            authorizedGrantTypes.add("client_credentials");

            BaseClientDetails clientDetails = new BaseClientDetails();
            clientDetails.setClientId("ristoreclient");
            clientDetails.setClientSecret("ristoresecret");
            clientDetails.setAuthorizedGrantTypes(authorizedGrantTypes);

            return clientDetails;

        } 
        else{
            throw new NoSuchClientException("No client with requested id: " + clientId);
        }
    }


}
