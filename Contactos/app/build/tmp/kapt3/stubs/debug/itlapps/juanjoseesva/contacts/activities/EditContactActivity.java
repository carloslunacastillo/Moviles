package itlapps.juanjoseesva.contacts.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\"\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J-\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u001f2\u0006\u0010 \u001a\u00020!H\u0016\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0014H\u0002J\u0006\u0010$\u001a\u00020\u0014J\u0006\u0010%\u001a\u00020\u0014J\u0006\u0010&\u001a\u00020\u0014J\u0006\u0010\'\u001a\u00020\u0014J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020\u0014H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006+"}, d2 = {"Litlapps/juanjoseesva/contacts/activities/EditContactActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "CAMERA", "", "CAMERA_REQUEST_CODE", "GALLERY", "contact", "Litlapps/juanjoseesva/contacts/model/Contact;", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "setRealm", "(Lio/realm/Realm;)V", "getBase64Image", "", "isCameraPermissionGranted", "", "makeCameraPermissionRequest", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openCamera", "openGallery", "saveContact", "selectDate", "selectPhoto", "setAdapters", "setData", "validate", "app_debug"})
public final class EditContactActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private io.realm.Realm realm;
    private final int GALLERY = 1;
    private final int CAMERA = 2;
    private final int CAMERA_REQUEST_CODE = 100;
    private itlapps.juanjoseesva.contacts.model.Contact contact;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.Realm getRealm() {
        return null;
    }
    
    public final void setRealm(@org.jetbrains.annotations.NotNull()
    io.realm.Realm p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setData() {
    }
    
    private final void setAdapters() {
    }
    
    public final void selectPhoto() {
    }
    
    public final void selectDate() {
    }
    
    public final void saveContact() {
    }
    
    private final boolean validate() {
        return false;
    }
    
    public final void openGallery() {
    }
    
    private final void openCamera() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final boolean isCameraPermissionGranted() {
        return false;
    }
    
    private final void makeCameraPermissionRequest() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final java.lang.String getBase64Image() {
        return null;
    }
    
    public EditContactActivity() {
        super();
    }
}