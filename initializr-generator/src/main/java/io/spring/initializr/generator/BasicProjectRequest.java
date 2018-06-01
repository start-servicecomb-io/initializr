/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spring.initializr.generator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * The base settings of a project request. Only these can be bound by user's input.
 *
 * @author Stephane Nicoll
 */
public class BasicProjectRequest {

    private List<String> style = new ArrayList<>();

    private List<String> dependencies = new ArrayList<>();

    private String name;

    private String type;

    private String description;

    private String groupId;

    private String artifactId;

    private String version;

    private String bootVersion;

    private String packaging;

    private String applicationName;

    private String language;

    private String packageName;

    private String javaVersion;

    // The base directory to create in the archive - no baseDir by default
    private String baseDir;

    // ServiceComb related parameters
    private String scbServiceName;
    private String scbServiceVersion;
    private String scbServiceCenterAddr;
    private boolean rest;
    private String scbRestaddr;
    private boolean highway;
    private String scbHighwayaddr;
    private boolean loadbalance;
    private boolean flowcontrol;
    private boolean circuitBreaker;
    private boolean tracing;


    public boolean isLoadbalance() {
        return loadbalance;
    }

    public void setLoadbalance(boolean loadbalance) {
        this.loadbalance = loadbalance;
    }

    public boolean isFlowcontrol() {
        return flowcontrol;
    }

    public void setFlowcontrol(boolean flowcontrol) {
        this.flowcontrol = flowcontrol;
    }

    public boolean isCircuitBreaker() {
        return circuitBreaker;
    }

    public void setCircuitBreaker(boolean circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    public boolean isTracing() {
        return tracing;
    }

    public void setTracing(boolean tracing) {
        this.tracing = tracing;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    public String getScbRestaddr() {
        return scbRestaddr;
    }

    public void setScbRestaddr(String scbRestaddr) {
        this.scbRestaddr = scbRestaddr;
    }

    public boolean isHighway() {
        return highway;
    }

    public void setHighway(boolean highway) {
        this.highway = highway;
    }

    public String getScbHighwayaddr() {
        return scbHighwayaddr;
    }

    public void setScbHighwayaddr(String scbHighwayaddr) {
        this.scbHighwayaddr = scbHighwayaddr;
    }


    public String getScbServiceName() {
        return scbServiceName;
    }

    public void setScbServiceName(String scbServiceName) {
        this.scbServiceName = scbServiceName;
    }

    public String getScbServiceVersion() {
        return scbServiceVersion;
    }

    public void setScbServiceVersion(String scbServiceVersion) {
        this.scbServiceVersion = scbServiceVersion;
    }

    public String getScbServiceCenterAddr() {
        return scbServiceCenterAddr;
    }

    public void setScbServiceCenterAddr(String scbServiceCenterAddr) {
        this.scbServiceCenterAddr = scbServiceCenterAddr;
    }

    public List<String> getStyle() {
        return this.style;
    }

    public void setStyle(List<String> style) {
        this.style = style;
    }

    public List<String> getDependencies() {
        return this.dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return this.artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBootVersion() {
        return this.bootVersion;
    }

    public void setBootVersion(String bootVersion) {
        this.bootVersion = bootVersion;
    }

    public String getPackaging() {
        return this.packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getApplicationName() {
        return this.applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPackageName() {
        if (StringUtils.hasText(this.packageName)) {
            return this.packageName;
        }
        if (StringUtils.hasText(this.groupId) && StringUtils.hasText(this.artifactId)) {
            return getGroupId() + "." + getArtifactId();
        }
        return null;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getJavaVersion() {
        return this.javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getBaseDir() {
        return this.baseDir;
    }

    public void setBaseDir(String baseDir) {
        this.baseDir = baseDir;
    }

}
