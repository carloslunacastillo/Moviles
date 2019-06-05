package itlapps.juanjoseesva.contacts.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b=\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u009f\u0001\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0017B\u0005\u00a2\u0006\u0002\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001a\"\u0004\b$\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001a\"\u0004\b>\u0010\u001cR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001a\"\u0004\b@\u0010\u001c\u00a8\u0006A"}, d2 = {"Litlapps/juanjoseesva/contacts/model/Contact;", "Ljava/io/Serializable;", "Lio/realm/RealmObject;", "name", "", "lastName1", "lastName2", "birthday", "phone", "email", "address", "paysheet", "area", "job", "state", "nss", "diseases", "photoURL", "scholarship", "nationality", "status", "emergencyContactName", "emergencyContactPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getArea", "setArea", "getBirthday", "setBirthday", "getDiseases", "setDiseases", "getEmail", "setEmail", "getEmergencyContactName", "setEmergencyContactName", "getEmergencyContactPhone", "setEmergencyContactPhone", "getJob", "setJob", "getLastName1", "setLastName1", "getLastName2", "setLastName2", "getName", "setName", "getNationality", "setNationality", "getNss", "setNss", "getPaysheet", "setPaysheet", "getPhone", "setPhone", "getPhotoURL", "setPhotoURL", "getScholarship", "setScholarship", "getState", "setState", "getStatus", "setStatus", "app_debug"})
@io.realm.annotations.RealmClass()
public class Contact extends io.realm.RealmObject implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @io.realm.annotations.Required()
    @io.realm.annotations.PrimaryKey()
    private java.lang.String paysheet;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastName2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String birthday;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String area;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String job;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String state;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nss;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String diseases;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String photoURL;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scholarship;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nationality;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String status;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String emergencyContactName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String emergencyContactPhone;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaysheet() {
        return null;
    }
    
    public final void setPaysheet(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName1() {
        return null;
    }
    
    public final void setLastName1(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastName2() {
        return null;
    }
    
    public final void setLastName2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    public final void setBirthday(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArea() {
        return null;
    }
    
    public final void setArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNss() {
        return null;
    }
    
    public final void setNss(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiseases() {
        return null;
    }
    
    public final void setDiseases(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhotoURL() {
        return null;
    }
    
    public final void setPhotoURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScholarship() {
        return null;
    }
    
    public final void setScholarship(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNationality() {
        return null;
    }
    
    public final void setNationality(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmergencyContactName() {
        return null;
    }
    
    public final void setEmergencyContactName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmergencyContactPhone() {
        return null;
    }
    
    public final void setEmergencyContactPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Contact() {
        super();
    }
    
    public Contact(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName1, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName2, @org.jetbrains.annotations.NotNull()
    java.lang.String birthday, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String paysheet, @org.jetbrains.annotations.NotNull()
    java.lang.String area, @org.jetbrains.annotations.NotNull()
    java.lang.String job, @org.jetbrains.annotations.NotNull()
    java.lang.String state, @org.jetbrains.annotations.NotNull()
    java.lang.String nss, @org.jetbrains.annotations.NotNull()
    java.lang.String diseases, @org.jetbrains.annotations.NotNull()
    java.lang.String photoURL, @org.jetbrains.annotations.NotNull()
    java.lang.String scholarship, @org.jetbrains.annotations.NotNull()
    java.lang.String nationality, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String emergencyContactName, @org.jetbrains.annotations.NotNull()
    java.lang.String emergencyContactPhone) {
        super();
    }
}