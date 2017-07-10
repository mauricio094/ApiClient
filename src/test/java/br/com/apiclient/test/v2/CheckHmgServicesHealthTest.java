package br.com.apiclient.test.v2;

import br.com.apiclient.ApiClient;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by macau on 10/07/17.
 */
public class CheckHmgServicesHealthTest {
    ApiClient client = new ApiClient();

    @Test
    public void estoqueHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-estoque-app1.netshoes.local:7280").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-estoque-app2.netshoes.local:7280").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void catalogoHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.110:8080/mp-catalogo-ws/rs").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.111:8080/mp-catalogo-ws/rs").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void lojistaHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-estoque-app1.netshoes.local:7280").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-estoque-app2.netshoes.local:7280").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void importadorHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.133:34899").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-importador-app1.netshoes.local:7187").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-importador-app2.netshoes.local:7187").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.114:8187").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.115:8187").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-importador-app1.netshoes.local:7183").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.114:8183").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.115:8183").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.115:8191").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.114:8189").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-importador-app1.netshoes.local:7189").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-importador-app2.netshoes.local:7189").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.115:8189").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void mensageiroHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-mensageiro-ap01.netshoes.local:7183").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-mensageiro-ap02.netshoes.local:7183").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void priceHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.122:8682").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.123:8682").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void matchHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.124:8683").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.125:8683").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void orderHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.125:8684").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.124:8684").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void notifyHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.125:8685").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.124:8685").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void flashHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.125:8688").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.124:8688").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void customerServiceHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-mp-container01.netshoes.local:8687").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg02-mp-container02.netshoes.local:8687").contains("\"status\":\"DOWN\""));
    }

    @Test
    public void productConfigurationHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.124:8689").contains("\"status\":\"DOWN\""));
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://172.18.52.125:8689").contains("\"status\":\"DOWN\""));
    }
    @Test
    public void pmpHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://hmg-nsi-pmp.ns2online.com.br/nsi-api-pmp/api").contains("\"status\":\"DOWN\""));
    }
    @Test
    public void nsiCatalogHealth() {
        Assert.assertFalse(client.checkMarketplaceHmgServices("http://nsi-catalog-api.ns2online.com.br").contains("\"status\":\"DOWN\""));
    }
}
