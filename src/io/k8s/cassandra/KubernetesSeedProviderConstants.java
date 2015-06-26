package io.k8s.cassandra;

public final class KubernetesSeedProviderConstants
{
    private KubernetesSeedProviderConstants() {}

    public static final String SERVER_ACCOUNT_TOKEN_PATH = "/var/run/secrets/kubernetes.io/serviceaccount/token";
    public static final String DEFAULT_MASTER_URL = "https://kubernetes.default.cluster.local";
    public static final String DEFAULT_SERVICE = "cassandra";
    public static final String DEFAULT_NAMESPACE = "default";
}