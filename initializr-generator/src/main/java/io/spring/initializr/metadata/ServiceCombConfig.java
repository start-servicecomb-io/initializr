package io.spring.initializr.metadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ServiceCombConfig {
    public static final String CHAINFLOWCONTROLPROVIDER = "qps-flowcontrol-provider";
    public static final String CHAINFCIRCUITBREAKERPROVIDER = "bizkeeper-provider";
    public static final String CHAINFTRACINGPROVIDER = "tracing-provider";
    public static final String PROLICYRETURNNULLPROVIDER = "returnnull";


    public String APPLICATION_ID;
    public ServiceDescription service_description = new ServiceDescription();
    public ServiceComb servicecomb = new ServiceComb();

    public String getAPPLICATION_ID() {
        return APPLICATION_ID;
    }

    public void setAPPLICATION_ID(String APPLICATION_ID) {
        this.APPLICATION_ID = APPLICATION_ID;
    }

    public ServiceDescription getService_description() {
        return service_description;
    }

    public void setService_description(ServiceDescription service_description) {
        this.service_description = service_description;
    }

    public ServiceComb getServicecomb() {
        return servicecomb;
    }

    public void setServicecomb(ServiceComb servicecomb) {
        this.servicecomb = servicecomb;
    }

    public class ServiceDescription {
        public String name;
        public String version;

        public String getName() {
            return name;
        }

        public ServiceDescription() {
        }

        public ServiceDescription(String name, String version) {
            this.name = name;
            this.version = version;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

    }

    public class ServiceComb {
        public ServiceCombService service = new ServiceCombService();
        public ServiceCombRest rest = new ServiceCombRest();
        public ServiceCombHighway highway = new ServiceCombHighway();
        public ServiceCombHandler handler = new ServiceCombHandler();
        public ServiceCombFlowcontrol flowcontrol = new ServiceCombFlowcontrol();
        public ServiceCombCircuitBreaker circuitBreaker = new ServiceCombCircuitBreaker();
        public ServiceCombFallbackpolicy fallbackpolicy = new ServiceCombFallbackpolicy();

        public ServiceComb() {
        }

    }

    public class ServiceCombCircuitBreaker {
        public Map<String, ServiceCombCircuitBreakerProviderService> Provider = new HashMap<String, ServiceCombCircuitBreakerProviderService>();

        public void add(String serviceName, int threshold) {
            ServiceCombCircuitBreakerProviderService service = new ServiceCombCircuitBreakerProviderService(threshold);
            this.Provider.put(serviceName, service);
        }

        public Map<String, ServiceCombCircuitBreakerProviderService> getProvider() {
            return Provider;
        }
    }

    public class ServiceCombCircuitBreakerProviderService {
        private int requestVolumeThreshold;

        public ServiceCombCircuitBreakerProviderService(int requestVolumeThreshold) {
            this.requestVolumeThreshold = requestVolumeThreshold;
        }

        public int getRequestVolumeThreshold() {
            return requestVolumeThreshold;
        }

        public void setRequestVolumeThreshold(int requestVolumeThreshold) {
            this.requestVolumeThreshold = requestVolumeThreshold;
        }
    }

    public class ServiceCombHandler {
        public ServiceCombHandlerChain chain = new ServiceCombHandlerChain();

        public ServiceCombHandler() {
        }
    }

    public class ServiceCombHandlerChain {

        public Map<String, String> Provider = new HashMap<String, String>();

        public void addProvider(String element) {
            if (Provider.containsKey("default")) {
                Provider.put("default", Provider.get("default") + "," + element);
            } else {
                Provider.put("default", element);
            }
        }

        public ServiceCombHandlerChain() {
        }
    }

    public class ServiceCombHandlerChainProvider {
        //TODO yaml item name should be `default`

        private String defaultstring = "";

        public void add(String element) {
            if ("".equals(defaultstring)) {
                defaultstring = defaultstring + element;
            } else {
                defaultstring = defaultstring + "," + element;
            }
        }

        public String getDefaultstring() {
            return defaultstring;
        }

        public void setDefaultstring(String defaultstring) {
            this.defaultstring = defaultstring;
        }
    }

    public class ServiceCombFallbackpolicy {
        public ServiceCombFallbackpolicyProvider provider = new ServiceCombFallbackpolicyProvider();

    }

    public class ServiceCombFallbackpolicyProvider {
        private String policy;

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }
    }


    public class ServiceCombFlowcontrol {
        public ServiceCombFlowcontrolProvider Provider = new ServiceCombFlowcontrolProvider();
    }

    public class ServiceCombFlowcontrolProvider {
        public ServiceCombFlowcontrolProviderQPS qps = new ServiceCombFlowcontrolProviderQPS();
    }

    public class ServiceCombFlowcontrolProviderQPS {
        public ServiceCombFlowcontrolProviderQPSLimit limit = new ServiceCombFlowcontrolProviderQPSLimit();
    }

    public class ServiceCombFlowcontrolProviderQPSLimit {
        private int gateway;

        public int getGateway() {
            return gateway;
        }

        public void setGateway(int gateway) {
            this.gateway = gateway;
        }
    }


    public class ServiceCombService {
        public ServiceCombServiceRegistry registry = new ServiceCombServiceRegistry();

        public ServiceCombService() {
        }
    }

    public class ServiceCombServiceRegistry {
        public String address;
        public boolean autodiscovery;


        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


    public class ServiceCombRest {
        public String address;

        public ServiceCombRest() {
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public class ServiceCombHighway {
        public String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
}





