package hu.khb.smss.prometheus.model;

import java.util.Date;

public class Alert {
    private String status;
    private Label labels;
    private Annotation annotations;
    private Date startsAt;
    private Date endsAt;
    private String generatorURL;
    private String fingerprint;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Label getLabels() {
        return labels;
    }

    public void setLabels(Label labels) {
        this.labels = labels;
    }

    public Annotation getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotation annotations) {
        this.annotations = annotations;
    }

    public Date getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Date startsAt) {
        this.startsAt = startsAt;
    }

    public Date getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Date endsAt) {
        this.endsAt = endsAt;
    }

    public String getGeneratorURL() {
        return generatorURL;
    }

    public void setGeneratorURL(String generatorURL) {
        this.generatorURL = generatorURL;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
}
