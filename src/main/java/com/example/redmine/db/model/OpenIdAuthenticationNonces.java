package com.example.redmine.db.model;

public class OpenIdAuthenticationNonces extends OpenIdAuthenticationNoncesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_id_authentication_nonces.timestamp
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private Integer timestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_id_authentication_nonces.server_url
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String serverUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.open_id_authentication_nonces.salt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    private String salt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.open_id_authentication_nonces.timestamp
     *
     * @return the value of public.open_id_authentication_nonces.timestamp
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.open_id_authentication_nonces.timestamp
     *
     * @param timestamp the value for public.open_id_authentication_nonces.timestamp
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.open_id_authentication_nonces.server_url
     *
     * @return the value of public.open_id_authentication_nonces.server_url
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.open_id_authentication_nonces.server_url
     *
     * @param serverUrl the value for public.open_id_authentication_nonces.server_url
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.open_id_authentication_nonces.salt
     *
     * @return the value of public.open_id_authentication_nonces.salt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.open_id_authentication_nonces.salt
     *
     * @param salt the value for public.open_id_authentication_nonces.salt
     *
     * @mbggenerated Sun Jun 05 22:10:02 JST 2016
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}