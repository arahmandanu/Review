package com.example.reviewtes.Review;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PojoData {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("data")
    @Expose
    private Object data;
    @SerializedName("dataMode")
    @Expose
    private Object dataMode;
    @SerializedName("headerData")
    @Expose
    private Object headerData;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("pathVariableData")
    @Expose
    private List<Object> pathVariableData = null;
    @SerializedName("queryParams")
    @Expose
    private List<Object> queryParams = null;
    @SerializedName("auth")
    @Expose
    private Object auth;
    @SerializedName("events")
    @Expose
    private Object events;
    @SerializedName("folder")
    @Expose
    private Object folder;
    @SerializedName("currentHelper")
    @Expose
    private Object currentHelper;
    @SerializedName("helperAttributes")
    @Expose
    private Object helperAttributes;
    @SerializedName("collectionId")
    @Expose
    private String collectionId;
    @SerializedName("pathVariables")
    @Expose
    private List<Object> pathVariables = null;
    @SerializedName("headers")
    @Expose
    private String headers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getDataMode() {
        return dataMode;
    }

    public void setDataMode(Object dataMode) {
        this.dataMode = dataMode;
    }

    public Object getHeaderData() {
        return headerData;
    }

    public void setHeaderData(Object headerData) {
        this.headerData = headerData;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Object> getPathVariableData() {
        return pathVariableData;
    }

    public void setPathVariableData(List<Object> pathVariableData) {
        this.pathVariableData = pathVariableData;
    }

    public List<Object> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(List<Object> queryParams) {
        this.queryParams = queryParams;
    }

    public Object getAuth() {
        return auth;
    }

    public void setAuth(Object auth) {
        this.auth = auth;
    }

    public Object getEvents() {
        return events;
    }

    public void setEvents(Object events) {
        this.events = events;
    }

    public Object getFolder() {
        return folder;
    }

    public void setFolder(Object folder) {
        this.folder = folder;
    }

    public Object getCurrentHelper() {
        return currentHelper;
    }

    public void setCurrentHelper(Object currentHelper) {
        this.currentHelper = currentHelper;
    }

    public Object getHelperAttributes() {
        return helperAttributes;
    }

    public void setHelperAttributes(Object helperAttributes) {
        this.helperAttributes = helperAttributes;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public List<Object> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(List<Object> pathVariables) {
        this.pathVariables = pathVariables;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }
}
