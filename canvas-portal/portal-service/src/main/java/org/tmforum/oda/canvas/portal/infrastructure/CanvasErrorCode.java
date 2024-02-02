package org.tmforum.oda.canvas.portal.infrastructure;

public enum CanvasErrorCode implements org.tmforum.oda.canvas.portal.core.exception.ExceptionErrorCode {

    // ODA (20121~20140)
    ODA_LIST_COMPONENT_INSTANCE_FAILED("ODA-CANVAS-20121"),
    ODA_GET_COMPONENT_INSTANCE_FAILED("ODA-CANVAS-20122"),
    ODA_COMPONENT_INSTANCE_NOT_EXIST("ODA-CANVAS-20123"),
    ODA_LIST_COMPONENT_API_FAILED("ODA-CANVAS-20124"),
    ODA_GET_COMPONENT_API_FAILED("ODA-CANVAS-20125"),
    ODA_COMPONENT_API_NOT_EXIST("ODA-CANVAS-20126"),
    ODA_LIST_COMPONENT_INSTANCE_EVENTS_FAILED("ODA-CANVAS-20127"),
    ODA_ADD_COMPONENT_FAILED("ODA-CANVAS-20128"),
    ODA_LIST_ORCHESTRATION_FAILED("ODA-CANVAS-20129"),
    ODA_GET_ORCHESTRATION_FAILED("ODA-CANVAS-20130"),
    ODA_ORCHESTRATION_NOT_EXIST("ODA-CANVAS-20131"),
    LIST_ODA_ORCHESTRATION_EVENTS_FAILED("ODA-CANVAS-20132"),
    ODA_CREATE_ORCHESTRATION_FAILED("ODA-CANVAS-20133"),
    ODA_UPDATE_ORCHESTRATION_FAILED("ODA-CANVAS-20134"),
    ODA_COMPONENT_COMPLIACNE_POD_NOT_EXIST("ODA-CANVAS-20135"),
    ODA_COMPONENT_COMPLIACNE_POD_NOT_READY("ODA-CANVAS-20136"),
    ODA_COMPONENT_NOT_EXIST("ODA-CANVAS-20137"),
    ODA_UNSUPPORTED("ODA-CANVAS-20138"),

    LIST_SERVICE_FAILED("ODA-CANVAS-20000"),
    GET_SERVICE_FAILED("ODA-CANVAS-20001"),
    SERVICE_NOT_EXIST("ODA-CANVAS-20002"),
    DELETE_SERVICE_FAILED("ODA-CANVAS-20003"),
    // K8s ConfigMap(20021~20040)
    LIST_CONFIGMAP_FAILED("ODA-CANVAS-20021"),
    GET_CONFIGMAP_FAILED("ODA-CANVAS-20022"),
    CONFIGMAP_NOT_EXIST("ODA-CANVAS-20023"),
    DELETE_CONFIGMAP_FAILED("ODA-CANVAS-20024"),
    // K8s Secret(20041~20060)
    LIST_SECRET_FAILED("ODA-CANVAS-20041"),
    GET_SECRET_FAILED("ODA-CANVAS-20042"),
    SECRET_NOT_EXIST("ODA-CANVAS-20043"),
    DELETE_SECRET_FAILED("ODA-CANVAS-20044"),
    // K8s Pod(20041~20060)
    LIST_POD_FAILED("ODA-CANVAS-20061"),
    GET_POD_FAILED("ODA-CANVAS-20062"),
    POD_NOT_EXIST("ODA-CANVAS-20063"),
    // K8s Namespace(20081~20100)
    LIST_NAMESPACE_FAILED("ODA-CANVAS-20081"),
    GET_NAMESPACE_FAILED("ODA-CANVAS-20082"),
    NAMESPACE_NOT_EXIST("ODA-CANVAS-20083"),
    // K8s Deployment(20101~20120)
    LIST_DEPLOYMENT_FAILED("ODA-CANVAS-20101"),
    GET_DEPLOYMENT_FAILED("ODA-CANVAS-20102"),
    DEPLOYMENT_NOT_EXIST("ODA-CANVAS-20103"),
    DELETE_DEPLOYMENT_FAILED("ODA-CANVAS-20104"),

    // K8s Endpoint(20161~20180)
    LIST_ENDPOINT_FAILED("ODA-CANVAS-20161"),
    GET_ENDPOINT_FAILED("ODA-CANVAS-20162"),
    ENDPOINT_NOT_EXIST("ODA-CANVAS-20163"),
    // K8s Event(20181~20200)
    LIST_EVENT_FAILED("ODA-CANVAS-20181"),

    // K8s Replicaset(20201~20219)
    LIST_REPLICASET_FAILED("ODA-CANVAS-20201"),

    // K8S Ingress(20220-20240)
    DELETE_INGRESS_FAILED("ODA-CANVAS-20220"),
    LIST_INGRESS_FAILED("ODA-CANVAS-20221"),
    GET_INGRESS_FAILED("ODA-CANVAS-20222"),
    INGRESS_NOT_EXIST("ODA-CANVAS-20223"),

    // K8S Job(20241-20260)
    DELETE_JOB_FAILED("ODA-CANVAS-20241"),
    LIST_JOB_FAILED("ODA-CANVAS-20242"),
    GET_JOB_FAILED("ODA-CANVAS-20243"),
    JOB_NOT_EXIST("ODA-CANVAS-20223");

    private final String code;

    /**
     * construtor
     *
     * @param code 错误码
     */
    CanvasErrorCode(String code) {
        this.code = code;
    }

    /**
     * 获取错误码
     *
     * @return code
     */
    public String code() {
        return code;
    }

    @Override
    public String toString() {
        return this.code;
    }

}