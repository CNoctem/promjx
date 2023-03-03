package hu.khb.smss.prometheus.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

public class Root {
    private String receiver;
    private String status;
    private ArrayList<Alert> alerts;
    private GroupLabel groupLabels;
    private CommonLabel commonLabels;
    private CommonAnnotation commonAnnotations;
    private String externalURL;
    private String version;
    private String groupKey;
    private int truncatedAlerts;

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Alert> getAlerts() {
        return alerts;
    }

    public void setAlerts(ArrayList<Alert> alerts) {
        this.alerts = alerts;
    }

    public GroupLabel getGroupLabels() {
        return groupLabels;
    }

    public void setGroupLabels(GroupLabel groupLabels) {
        this.groupLabels = groupLabels;
    }

    public CommonLabel getCommonLabels() {
        return commonLabels;
    }

    public void setCommonLabels(CommonLabel commonLabels) {
        this.commonLabels = commonLabels;
    }

    public CommonAnnotation getCommonAnnotations() {
        return commonAnnotations;
    }

    public void setCommonAnnotations(CommonAnnotation commonAnnotations) {
        this.commonAnnotations = commonAnnotations;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public void setExternalURL(String externalURL) {
        this.externalURL = externalURL;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public int getTruncatedAlerts() {
        return truncatedAlerts;
    }

    public void setTruncatedAlerts(int truncatedAlerts) {
        this.truncatedAlerts = truncatedAlerts;
    }

    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(Root.class.getResource("/prometheus-webhook-alert-sample.json"), Root.class);
        System.out.println(root);
    }

}