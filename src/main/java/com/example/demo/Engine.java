package com.example.demo;

import org.springframework.boot.context.properties.*;
import org.springframework.stereotype.*;

@ConfigurationProperties(prefix = "env.engine")
@Component
public class Engine {

	private String datalake_namenode_hue;
	private String datalake_job_queue_property_hive;
	private String datalake_security;
	private String datalake_filesystem_output;
	private String datalake_realm_kerberos;
	private String datalake_filesystem_apps;
	private String datalake_kerberos_master_principal_hbase;
	private String datalake_job_queue_name_hive;
	private String datalake_zookeeper_port_client_hbase;
	private String datalake_hdfs_apps;
	private String datalake_namenode_jobtracker;
	private String datalake_namenode_port_hdfs;
	private String datalake_cluster;
	private String datalake_namenode_port_spark;
	private String datalake_namenode_port_hive;
	private String datalake_zookeeper_quorum_hbase;
	private String datalake_namenode_oozie;
	private String datalake_bdneg;
	private String datalake_keytabfile;
	private String datalake_namenode_port_oozie;
	private String datalake_jobtracker_port;
	private String datalake_path_keytab;
	private String datalake_namenode_port_hue;
	private String datalake_jobtracker_server;
	private String datalake_namenode_spark;
	private String datalake_host_kerberos;
	private String datalake_zookeeper_clientport_hbase;
	private String datalake_namenode_port_jobtracker;
	private String datalake_namenode_port_hbase;
	private String datalake_hdfs_data;
	private String datalake_namenode_hdfs;
	private String datalake_kerberos_regionserver_principal_hbase;
	private String datalake_queue;
	private String datalake_namenode_hive;
	private String datalake_usuario;
	private String datalake_namenode_hbase;
	private String path;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDatalake_namenode_hue() {
		return datalake_namenode_hue;
	}

	public void setDatalake_namenode_hue(String datalake_namenode_hue) {
		this.datalake_namenode_hue = datalake_namenode_hue;
	}

	public String getDatalake_job_queue_property_hive() {
		return datalake_job_queue_property_hive;
	}

	public void setDatalake_job_queue_property_hive(String datalake_job_queue_property_hive) {
		this.datalake_job_queue_property_hive = datalake_job_queue_property_hive;
	}

	public String getDatalake_security() {
		return datalake_security;
	}

	public void setDatalake_security(String datalake_security) {
		this.datalake_security = datalake_security;
	}

	public String getDatalake_filesystem_output() {
		return datalake_filesystem_output;
	}

	public void setDatalake_filesystem_output(String datalake_filesystem_output) {
		this.datalake_filesystem_output = datalake_filesystem_output;
	}

	public String getDatalake_realm_kerberos() {
		return datalake_realm_kerberos;
	}

	public void setDatalake_realm_kerberos(String datalake_realm_kerberos) {
		this.datalake_realm_kerberos = datalake_realm_kerberos;
	}

	public String getDatalake_filesystem_apps() {
		return datalake_filesystem_apps;
	}

	public void setDatalake_filesystem_apps(String datalake_filesystem_apps) {
		this.datalake_filesystem_apps = datalake_filesystem_apps;
	}

	public String getDatalake_kerberos_master_principal_hbase() {
		return datalake_kerberos_master_principal_hbase;
	}

	public void setDatalake_kerberos_master_principal_hbase(String datalake_kerberos_master_principal_hbase) {
		this.datalake_kerberos_master_principal_hbase = datalake_kerberos_master_principal_hbase;
	}

	public String getDatalake_job_queue_name_hive() {
		return datalake_job_queue_name_hive;
	}

	public void setDatalake_job_queue_name_hive(String datalake_job_queue_name_hive) {
		this.datalake_job_queue_name_hive = datalake_job_queue_name_hive;
	}

	public String getDatalake_zookeeper_port_client_hbase() {
		return datalake_zookeeper_port_client_hbase;
	}

	public void setDatalake_zookeeper_port_client_hbase(String datalake_zookeeper_port_client_hbase) {
		this.datalake_zookeeper_port_client_hbase = datalake_zookeeper_port_client_hbase;
	}

	public String getDatalake_hdfs_apps() {
		return datalake_hdfs_apps;
	}

	public void setDatalake_hdfs_apps(String datalake_hdfs_apps) {
		this.datalake_hdfs_apps = datalake_hdfs_apps;
	}

	public String getDatalake_namenode_jobtracker() {
		return datalake_namenode_jobtracker;
	}

	public void setDatalake_namenode_jobtracker(String datalake_namenode_jobtracker) {
		this.datalake_namenode_jobtracker = datalake_namenode_jobtracker;
	}

	public String getDatalake_namenode_port_hdfs() {
		return datalake_namenode_port_hdfs;
	}

	public void setDatalake_namenode_port_hdfs(String datalake_namenode_port_hdfs) {
		this.datalake_namenode_port_hdfs = datalake_namenode_port_hdfs;
	}

	public String getDatalake_cluster() {
		return datalake_cluster;
	}

	public void setDatalake_cluster(String datalake_cluster) {
		this.datalake_cluster = datalake_cluster;
	}

	public String getDatalake_namenode_port_spark() {
		return datalake_namenode_port_spark;
	}

	public void setDatalake_namenode_port_spark(String datalake_namenode_port_spark) {
		this.datalake_namenode_port_spark = datalake_namenode_port_spark;
	}

	public String getDatalake_namenode_port_hive() {
		return datalake_namenode_port_hive;
	}

	public void setDatalake_namenode_port_hive(String datalake_namenode_port_hive) {
		this.datalake_namenode_port_hive = datalake_namenode_port_hive;
	}

	public String getDatalake_zookeeper_quorum_hbase() {
		return datalake_zookeeper_quorum_hbase;
	}

	public void setDatalake_zookeeper_quorum_hbase(String datalake_zookeeper_quorum_hbase) {
		this.datalake_zookeeper_quorum_hbase = datalake_zookeeper_quorum_hbase;
	}

	public String getDatalake_namenode_oozie() {
		return datalake_namenode_oozie;
	}

	public void setDatalake_namenode_oozie(String datalake_namenode_oozie) {
		this.datalake_namenode_oozie = datalake_namenode_oozie;
	}

	public String getDatalake_bdneg() {
		return datalake_bdneg;
	}

	public void setDatalake_bdneg(String datalake_bdneg) {
		this.datalake_bdneg = datalake_bdneg;
	}

	public String getDatalake_keytabfile() {
		return datalake_keytabfile;
	}

	public void setDatalake_keytabfile(String datalake_keytabfile) {
		this.datalake_keytabfile = datalake_keytabfile;
	}

	public String getDatalake_namenode_port_oozie() {
		return datalake_namenode_port_oozie;
	}

	public void setDatalake_namenode_port_oozie(String datalake_namenode_port_oozie) {
		this.datalake_namenode_port_oozie = datalake_namenode_port_oozie;
	}

	public String getDatalake_jobtracker_port() {
		return datalake_jobtracker_port;
	}

	public void setDatalake_jobtracker_port(String datalake_jobtracker_port) {
		this.datalake_jobtracker_port = datalake_jobtracker_port;
	}

	public String getDatalake_path_keytab() {
		return datalake_path_keytab;
	}

	public void setDatalake_path_keytab(String datalake_path_keytab) {
		this.datalake_path_keytab = datalake_path_keytab;
	}

	public String getDatalake_namenode_port_hue() {
		return datalake_namenode_port_hue;
	}

	public void setDatalake_namenode_port_hue(String datalake_namenode_port_hue) {
		this.datalake_namenode_port_hue = datalake_namenode_port_hue;
	}

	public String getDatalake_jobtracker_server() {
		return datalake_jobtracker_server;
	}

	public void setDatalake_jobtracker_server(String datalake_jobtracker_server) {
		this.datalake_jobtracker_server = datalake_jobtracker_server;
	}

	public String getDatalake_namenode_spark() {
		return datalake_namenode_spark;
	}

	public void setDatalake_namenode_spark(String datalake_namenode_spark) {
		this.datalake_namenode_spark = datalake_namenode_spark;
	}

	public String getDatalake_host_kerberos() {
		return datalake_host_kerberos;
	}

	public void setDatalake_host_kerberos(String datalake_host_kerberos) {
		this.datalake_host_kerberos = datalake_host_kerberos;
	}

	public String getDatalake_zookeeper_clientport_hbase() {
		return datalake_zookeeper_clientport_hbase;
	}

	public void setDatalake_zookeeper_clientport_hbase(String datalake_zookeeper_clientport_hbase) {
		this.datalake_zookeeper_clientport_hbase = datalake_zookeeper_clientport_hbase;
	}

	public String getDatalake_namenode_port_jobtracker() {
		return datalake_namenode_port_jobtracker;
	}

	public void setDatalake_namenode_port_jobtracker(String datalake_namenode_port_jobtracker) {
		this.datalake_namenode_port_jobtracker = datalake_namenode_port_jobtracker;
	}

	public String getDatalake_namenode_port_hbase() {
		return datalake_namenode_port_hbase;
	}

	public void setDatalake_namenode_port_hbase(String datalake_namenode_port_hbase) {
		this.datalake_namenode_port_hbase = datalake_namenode_port_hbase;
	}

	public String getDatalake_hdfs_data() {
		return datalake_hdfs_data;
	}

	public void setDatalake_hdfs_data(String datalake_hdfs_data) {
		this.datalake_hdfs_data = datalake_hdfs_data;
	}

	public String getDatalake_namenode_hdfs() {
		return datalake_namenode_hdfs;
	}

	public void setDatalake_namenode_hdfs(String datalake_namenode_hdfs) {
		this.datalake_namenode_hdfs = datalake_namenode_hdfs;
	}

	public String getDatalake_kerberos_regionserver_principal_hbase() {
		return datalake_kerberos_regionserver_principal_hbase;
	}

	public void setDatalake_kerberos_regionserver_principal_hbase(
			String datalake_kerberos_regionserver_principal_hbase) {
		this.datalake_kerberos_regionserver_principal_hbase = datalake_kerberos_regionserver_principal_hbase;
	}

	public String getDatalake_queue() {
		return datalake_queue;
	}

	public void setDatalake_queue(String datalake_queue) {
		this.datalake_queue = datalake_queue;
	}

	public String getDatalake_namenode_hive() {
		return datalake_namenode_hive;
	}

	public void setDatalake_namenode_hive(String datalake_namenode_hive) {
		this.datalake_namenode_hive = datalake_namenode_hive;
	}

	public String getDatalake_usuario() {
		return datalake_usuario;
	}

	public void setDatalake_usuario(String datalake_usuario) {
		this.datalake_usuario = datalake_usuario;
	}

	public String getDatalake_namenode_hbase() {
		return datalake_namenode_hbase;
	}

	public void setDatalake_namenode_hbase(String datalake_namenode_hbase) {
		this.datalake_namenode_hbase = datalake_namenode_hbase;
	}

}
