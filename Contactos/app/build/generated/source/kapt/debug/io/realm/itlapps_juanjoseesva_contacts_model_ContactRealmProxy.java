package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class itlapps_juanjoseesva_contacts_model_ContactRealmProxy extends itlapps.juanjoseesva.contacts.model.Contact
    implements RealmObjectProxy, itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface {

    static final class ContactColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long paysheetIndex;
        long nameIndex;
        long lastName1Index;
        long lastName2Index;
        long birthdayIndex;
        long phoneIndex;
        long emailIndex;
        long addressIndex;
        long areaIndex;
        long jobIndex;
        long stateIndex;
        long nssIndex;
        long diseasesIndex;
        long photoURLIndex;
        long scholarshipIndex;
        long nationalityIndex;
        long statusIndex;
        long emergencyContactNameIndex;
        long emergencyContactPhoneIndex;

        ContactColumnInfo(OsSchemaInfo schemaInfo) {
            super(19);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Contact");
            this.paysheetIndex = addColumnDetails("paysheet", "paysheet", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.lastName1Index = addColumnDetails("lastName1", "lastName1", objectSchemaInfo);
            this.lastName2Index = addColumnDetails("lastName2", "lastName2", objectSchemaInfo);
            this.birthdayIndex = addColumnDetails("birthday", "birthday", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.addressIndex = addColumnDetails("address", "address", objectSchemaInfo);
            this.areaIndex = addColumnDetails("area", "area", objectSchemaInfo);
            this.jobIndex = addColumnDetails("job", "job", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.nssIndex = addColumnDetails("nss", "nss", objectSchemaInfo);
            this.diseasesIndex = addColumnDetails("diseases", "diseases", objectSchemaInfo);
            this.photoURLIndex = addColumnDetails("photoURL", "photoURL", objectSchemaInfo);
            this.scholarshipIndex = addColumnDetails("scholarship", "scholarship", objectSchemaInfo);
            this.nationalityIndex = addColumnDetails("nationality", "nationality", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.emergencyContactNameIndex = addColumnDetails("emergencyContactName", "emergencyContactName", objectSchemaInfo);
            this.emergencyContactPhoneIndex = addColumnDetails("emergencyContactPhone", "emergencyContactPhone", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContactColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ContactColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ContactColumnInfo src = (ContactColumnInfo) rawSrc;
            final ContactColumnInfo dst = (ContactColumnInfo) rawDst;
            dst.paysheetIndex = src.paysheetIndex;
            dst.nameIndex = src.nameIndex;
            dst.lastName1Index = src.lastName1Index;
            dst.lastName2Index = src.lastName2Index;
            dst.birthdayIndex = src.birthdayIndex;
            dst.phoneIndex = src.phoneIndex;
            dst.emailIndex = src.emailIndex;
            dst.addressIndex = src.addressIndex;
            dst.areaIndex = src.areaIndex;
            dst.jobIndex = src.jobIndex;
            dst.stateIndex = src.stateIndex;
            dst.nssIndex = src.nssIndex;
            dst.diseasesIndex = src.diseasesIndex;
            dst.photoURLIndex = src.photoURLIndex;
            dst.scholarshipIndex = src.scholarshipIndex;
            dst.nationalityIndex = src.nationalityIndex;
            dst.statusIndex = src.statusIndex;
            dst.emergencyContactNameIndex = src.emergencyContactNameIndex;
            dst.emergencyContactPhoneIndex = src.emergencyContactPhoneIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ContactColumnInfo columnInfo;
    private ProxyState<itlapps.juanjoseesva.contacts.model.Contact> proxyState;

    itlapps_juanjoseesva_contacts_model_ContactRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ContactColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<itlapps.juanjoseesva.contacts.model.Contact>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$paysheet() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.paysheetIndex);
    }

    @Override
    public void realmSet$paysheet(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'paysheet' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastName1() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastName1Index);
    }

    @Override
    public void realmSet$lastName1(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastName1' to null.");
            }
            row.getTable().setString(columnInfo.lastName1Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName1' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.lastName1Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastName2() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastName2Index);
    }

    @Override
    public void realmSet$lastName2(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastName2' to null.");
            }
            row.getTable().setString(columnInfo.lastName2Index, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'lastName2' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.lastName2Index, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$birthday() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.birthdayIndex);
    }

    @Override
    public void realmSet$birthday(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'birthday' to null.");
            }
            row.getTable().setString(columnInfo.birthdayIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'birthday' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.birthdayIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneIndex);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
            }
            row.getTable().setString(columnInfo.phoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.phoneIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$email() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emailIndex);
    }

    @Override
    public void realmSet$email(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
            }
            row.getTable().setString(columnInfo.emailIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.emailIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressIndex);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
            }
            row.getTable().setString(columnInfo.addressIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'address' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.addressIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$area() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.areaIndex);
    }

    @Override
    public void realmSet$area(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'area' to null.");
            }
            row.getTable().setString(columnInfo.areaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'area' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.areaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$job() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jobIndex);
    }

    @Override
    public void realmSet$job(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'job' to null.");
            }
            row.getTable().setString(columnInfo.jobIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'job' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.jobIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$state() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.stateIndex);
    }

    @Override
    public void realmSet$state(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'state' to null.");
            }
            row.getTable().setString(columnInfo.stateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'state' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.stateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nss() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nssIndex);
    }

    @Override
    public void realmSet$nss(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nss' to null.");
            }
            row.getTable().setString(columnInfo.nssIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'nss' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nssIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$diseases() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.diseasesIndex);
    }

    @Override
    public void realmSet$diseases(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'diseases' to null.");
            }
            row.getTable().setString(columnInfo.diseasesIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'diseases' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.diseasesIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photoURL() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoURLIndex);
    }

    @Override
    public void realmSet$photoURL(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'photoURL' to null.");
            }
            row.getTable().setString(columnInfo.photoURLIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'photoURL' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.photoURLIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$scholarship() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.scholarshipIndex);
    }

    @Override
    public void realmSet$scholarship(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'scholarship' to null.");
            }
            row.getTable().setString(columnInfo.scholarshipIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'scholarship' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.scholarshipIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nationality() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nationalityIndex);
    }

    @Override
    public void realmSet$nationality(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nationality' to null.");
            }
            row.getTable().setString(columnInfo.nationalityIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'nationality' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nationalityIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$emergencyContactName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emergencyContactNameIndex);
    }

    @Override
    public void realmSet$emergencyContactName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'emergencyContactName' to null.");
            }
            row.getTable().setString(columnInfo.emergencyContactNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'emergencyContactName' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.emergencyContactNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$emergencyContactPhone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.emergencyContactPhoneIndex);
    }

    @Override
    public void realmSet$emergencyContactPhone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'emergencyContactPhone' to null.");
            }
            row.getTable().setString(columnInfo.emergencyContactPhoneIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'emergencyContactPhone' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.emergencyContactPhoneIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Contact", 19, 0);
        builder.addPersistedProperty("paysheet", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lastName1", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lastName2", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("birthday", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("email", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("area", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("job", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("state", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nss", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("diseases", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("photoURL", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("scholarship", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nationality", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("emergencyContactName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("emergencyContactPhone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ContactColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Contact";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Contact";
    }

    @SuppressWarnings("cast")
    public static itlapps.juanjoseesva.contacts.model.Contact createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        itlapps.juanjoseesva.contacts.model.Contact obj = null;
        if (update) {
            Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
            ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class);
            long pkColumnIndex = columnInfo.paysheetIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("paysheet")) {
                rowIndex = table.findFirstString(pkColumnIndex, json.getString("paysheet"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class), false, Collections.<String> emptyList());
                    obj = new io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("paysheet")) {
                if (json.isNull("paysheet")) {
                    obj = (io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy) realm.createObjectInternal(itlapps.juanjoseesva.contacts.model.Contact.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy) realm.createObjectInternal(itlapps.juanjoseesva.contacts.model.Contact.class, json.getString("paysheet"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'paysheet'.");
            }
        }

        final itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface objProxy = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("lastName1")) {
            if (json.isNull("lastName1")) {
                objProxy.realmSet$lastName1(null);
            } else {
                objProxy.realmSet$lastName1((String) json.getString("lastName1"));
            }
        }
        if (json.has("lastName2")) {
            if (json.isNull("lastName2")) {
                objProxy.realmSet$lastName2(null);
            } else {
                objProxy.realmSet$lastName2((String) json.getString("lastName2"));
            }
        }
        if (json.has("birthday")) {
            if (json.isNull("birthday")) {
                objProxy.realmSet$birthday(null);
            } else {
                objProxy.realmSet$birthday((String) json.getString("birthday"));
            }
        }
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        if (json.has("email")) {
            if (json.isNull("email")) {
                objProxy.realmSet$email(null);
            } else {
                objProxy.realmSet$email((String) json.getString("email"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("area")) {
            if (json.isNull("area")) {
                objProxy.realmSet$area(null);
            } else {
                objProxy.realmSet$area((String) json.getString("area"));
            }
        }
        if (json.has("job")) {
            if (json.isNull("job")) {
                objProxy.realmSet$job(null);
            } else {
                objProxy.realmSet$job((String) json.getString("job"));
            }
        }
        if (json.has("state")) {
            if (json.isNull("state")) {
                objProxy.realmSet$state(null);
            } else {
                objProxy.realmSet$state((String) json.getString("state"));
            }
        }
        if (json.has("nss")) {
            if (json.isNull("nss")) {
                objProxy.realmSet$nss(null);
            } else {
                objProxy.realmSet$nss((String) json.getString("nss"));
            }
        }
        if (json.has("diseases")) {
            if (json.isNull("diseases")) {
                objProxy.realmSet$diseases(null);
            } else {
                objProxy.realmSet$diseases((String) json.getString("diseases"));
            }
        }
        if (json.has("photoURL")) {
            if (json.isNull("photoURL")) {
                objProxy.realmSet$photoURL(null);
            } else {
                objProxy.realmSet$photoURL((String) json.getString("photoURL"));
            }
        }
        if (json.has("scholarship")) {
            if (json.isNull("scholarship")) {
                objProxy.realmSet$scholarship(null);
            } else {
                objProxy.realmSet$scholarship((String) json.getString("scholarship"));
            }
        }
        if (json.has("nationality")) {
            if (json.isNull("nationality")) {
                objProxy.realmSet$nationality(null);
            } else {
                objProxy.realmSet$nationality((String) json.getString("nationality"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("emergencyContactName")) {
            if (json.isNull("emergencyContactName")) {
                objProxy.realmSet$emergencyContactName(null);
            } else {
                objProxy.realmSet$emergencyContactName((String) json.getString("emergencyContactName"));
            }
        }
        if (json.has("emergencyContactPhone")) {
            if (json.isNull("emergencyContactPhone")) {
                objProxy.realmSet$emergencyContactPhone(null);
            } else {
                objProxy.realmSet$emergencyContactPhone((String) json.getString("emergencyContactPhone"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static itlapps.juanjoseesva.contacts.model.Contact createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final itlapps.juanjoseesva.contacts.model.Contact obj = new itlapps.juanjoseesva.contacts.model.Contact();
        final itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface objProxy = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("paysheet")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$paysheet((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$paysheet(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("lastName1")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastName1((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastName1(null);
                }
            } else if (name.equals("lastName2")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastName2((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastName2(null);
                }
            } else if (name.equals("birthday")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$birthday((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$birthday(null);
                }
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else if (name.equals("email")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$email((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$email(null);
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("area")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$area((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$area(null);
                }
            } else if (name.equals("job")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$job((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$job(null);
                }
            } else if (name.equals("state")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$state((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$state(null);
                }
            } else if (name.equals("nss")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nss((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nss(null);
                }
            } else if (name.equals("diseases")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$diseases((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$diseases(null);
                }
            } else if (name.equals("photoURL")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photoURL((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photoURL(null);
                }
            } else if (name.equals("scholarship")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$scholarship((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$scholarship(null);
                }
            } else if (name.equals("nationality")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nationality((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nationality(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("emergencyContactName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$emergencyContactName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$emergencyContactName(null);
                }
            } else if (name.equals("emergencyContactPhone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$emergencyContactPhone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$emergencyContactPhone(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'paysheet'.");
        }
        return realm.copyToRealm(obj);
    }

    private static itlapps_juanjoseesva_contacts_model_ContactRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class), false, Collections.<String>emptyList());
        io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy obj = new io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static itlapps.juanjoseesva.contacts.model.Contact copyOrUpdate(Realm realm, ContactColumnInfo columnInfo, itlapps.juanjoseesva.contacts.model.Contact object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (itlapps.juanjoseesva.contacts.model.Contact) cachedRealmObject;
        }

        itlapps.juanjoseesva.contacts.model.Contact realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
            long pkColumnIndex = columnInfo.paysheetIndex;
            long rowIndex = table.findFirstString(pkColumnIndex, ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$paysheet());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static itlapps.juanjoseesva.contacts.model.Contact copy(Realm realm, ContactColumnInfo columnInfo, itlapps.juanjoseesva.contacts.model.Contact newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (itlapps.juanjoseesva.contacts.model.Contact) cachedRealmObject;
        }

        itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface realmObjectSource = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) newObject;

        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.paysheetIndex, realmObjectSource.realmGet$paysheet());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.lastName1Index, realmObjectSource.realmGet$lastName1());
        builder.addString(columnInfo.lastName2Index, realmObjectSource.realmGet$lastName2());
        builder.addString(columnInfo.birthdayIndex, realmObjectSource.realmGet$birthday());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.areaIndex, realmObjectSource.realmGet$area());
        builder.addString(columnInfo.jobIndex, realmObjectSource.realmGet$job());
        builder.addString(columnInfo.stateIndex, realmObjectSource.realmGet$state());
        builder.addString(columnInfo.nssIndex, realmObjectSource.realmGet$nss());
        builder.addString(columnInfo.diseasesIndex, realmObjectSource.realmGet$diseases());
        builder.addString(columnInfo.photoURLIndex, realmObjectSource.realmGet$photoURL());
        builder.addString(columnInfo.scholarshipIndex, realmObjectSource.realmGet$scholarship());
        builder.addString(columnInfo.nationalityIndex, realmObjectSource.realmGet$nationality());
        builder.addString(columnInfo.statusIndex, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.emergencyContactNameIndex, realmObjectSource.realmGet$emergencyContactName());
        builder.addString(columnInfo.emergencyContactPhoneIndex, realmObjectSource.realmGet$emergencyContactPhone());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.itlapps_juanjoseesva_contacts_model_ContactRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, itlapps.juanjoseesva.contacts.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class);
        long pkColumnIndex = columnInfo.paysheetIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$paysheet();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$lastName1 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName1();
        if (realmGet$lastName1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastName1Index, rowIndex, realmGet$lastName1, false);
        }
        String realmGet$lastName2 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName2();
        if (realmGet$lastName2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastName2Index, rowIndex, realmGet$lastName2, false);
        }
        String realmGet$birthday = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.birthdayIndex, rowIndex, realmGet$birthday, false);
        }
        String realmGet$phone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        }
        String realmGet$email = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        }
        String realmGet$address = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        }
        String realmGet$area = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.areaIndex, rowIndex, realmGet$area, false);
        }
        String realmGet$job = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$job();
        if (realmGet$job != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jobIndex, rowIndex, realmGet$job, false);
        }
        String realmGet$state = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stateIndex, rowIndex, realmGet$state, false);
        }
        String realmGet$nss = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nss();
        if (realmGet$nss != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nssIndex, rowIndex, realmGet$nss, false);
        }
        String realmGet$diseases = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$diseases();
        if (realmGet$diseases != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diseasesIndex, rowIndex, realmGet$diseases, false);
        }
        String realmGet$photoURL = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$photoURL();
        if (realmGet$photoURL != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoURLIndex, rowIndex, realmGet$photoURL, false);
        }
        String realmGet$scholarship = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$scholarship();
        if (realmGet$scholarship != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, realmGet$scholarship, false);
        }
        String realmGet$nationality = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nationality();
        if (realmGet$nationality != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nationalityIndex, rowIndex, realmGet$nationality, false);
        }
        String realmGet$status = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$emergencyContactName = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactName();
        if (realmGet$emergencyContactName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, realmGet$emergencyContactName, false);
        }
        String realmGet$emergencyContactPhone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactPhone();
        if (realmGet$emergencyContactPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, realmGet$emergencyContactPhone, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class);
        long pkColumnIndex = columnInfo.paysheetIndex;
        itlapps.juanjoseesva.contacts.model.Contact object = null;
        while (objects.hasNext()) {
            object = (itlapps.juanjoseesva.contacts.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$paysheet();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$lastName1 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName1();
            if (realmGet$lastName1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastName1Index, rowIndex, realmGet$lastName1, false);
            }
            String realmGet$lastName2 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName2();
            if (realmGet$lastName2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastName2Index, rowIndex, realmGet$lastName2, false);
            }
            String realmGet$birthday = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$birthday();
            if (realmGet$birthday != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.birthdayIndex, rowIndex, realmGet$birthday, false);
            }
            String realmGet$phone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            }
            String realmGet$email = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            }
            String realmGet$address = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            }
            String realmGet$area = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$area();
            if (realmGet$area != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.areaIndex, rowIndex, realmGet$area, false);
            }
            String realmGet$job = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$job();
            if (realmGet$job != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jobIndex, rowIndex, realmGet$job, false);
            }
            String realmGet$state = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$state();
            if (realmGet$state != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stateIndex, rowIndex, realmGet$state, false);
            }
            String realmGet$nss = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nss();
            if (realmGet$nss != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nssIndex, rowIndex, realmGet$nss, false);
            }
            String realmGet$diseases = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$diseases();
            if (realmGet$diseases != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diseasesIndex, rowIndex, realmGet$diseases, false);
            }
            String realmGet$photoURL = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$photoURL();
            if (realmGet$photoURL != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoURLIndex, rowIndex, realmGet$photoURL, false);
            }
            String realmGet$scholarship = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$scholarship();
            if (realmGet$scholarship != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, realmGet$scholarship, false);
            }
            String realmGet$nationality = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nationality();
            if (realmGet$nationality != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nationalityIndex, rowIndex, realmGet$nationality, false);
            }
            String realmGet$status = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$emergencyContactName = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactName();
            if (realmGet$emergencyContactName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, realmGet$emergencyContactName, false);
            }
            String realmGet$emergencyContactPhone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactPhone();
            if (realmGet$emergencyContactPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, realmGet$emergencyContactPhone, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, itlapps.juanjoseesva.contacts.model.Contact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class);
        long pkColumnIndex = columnInfo.paysheetIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$paysheet();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$lastName1 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName1();
        if (realmGet$lastName1 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastName1Index, rowIndex, realmGet$lastName1, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastName1Index, rowIndex, false);
        }
        String realmGet$lastName2 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName2();
        if (realmGet$lastName2 != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastName2Index, rowIndex, realmGet$lastName2, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastName2Index, rowIndex, false);
        }
        String realmGet$birthday = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.birthdayIndex, rowIndex, realmGet$birthday, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.birthdayIndex, rowIndex, false);
        }
        String realmGet$phone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
        }
        String realmGet$email = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
        }
        String realmGet$address = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
        }
        String realmGet$area = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.areaIndex, rowIndex, realmGet$area, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.areaIndex, rowIndex, false);
        }
        String realmGet$job = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$job();
        if (realmGet$job != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jobIndex, rowIndex, realmGet$job, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jobIndex, rowIndex, false);
        }
        String realmGet$state = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.stateIndex, rowIndex, realmGet$state, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.stateIndex, rowIndex, false);
        }
        String realmGet$nss = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nss();
        if (realmGet$nss != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nssIndex, rowIndex, realmGet$nss, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nssIndex, rowIndex, false);
        }
        String realmGet$diseases = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$diseases();
        if (realmGet$diseases != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.diseasesIndex, rowIndex, realmGet$diseases, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.diseasesIndex, rowIndex, false);
        }
        String realmGet$photoURL = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$photoURL();
        if (realmGet$photoURL != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoURLIndex, rowIndex, realmGet$photoURL, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoURLIndex, rowIndex, false);
        }
        String realmGet$scholarship = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$scholarship();
        if (realmGet$scholarship != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, realmGet$scholarship, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, false);
        }
        String realmGet$nationality = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nationality();
        if (realmGet$nationality != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nationalityIndex, rowIndex, realmGet$nationality, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nationalityIndex, rowIndex, false);
        }
        String realmGet$status = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$emergencyContactName = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactName();
        if (realmGet$emergencyContactName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, realmGet$emergencyContactName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, false);
        }
        String realmGet$emergencyContactPhone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactPhone();
        if (realmGet$emergencyContactPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, realmGet$emergencyContactPhone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        long tableNativePtr = table.getNativePtr();
        ContactColumnInfo columnInfo = (ContactColumnInfo) realm.getSchema().getColumnInfo(itlapps.juanjoseesva.contacts.model.Contact.class);
        long pkColumnIndex = columnInfo.paysheetIndex;
        itlapps.juanjoseesva.contacts.model.Contact object = null;
        while (objects.hasNext()) {
            object = (itlapps.juanjoseesva.contacts.model.Contact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$paysheet();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstString(tableNativePtr, pkColumnIndex, (String)primaryKeyValue);
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$lastName1 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName1();
            if (realmGet$lastName1 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastName1Index, rowIndex, realmGet$lastName1, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastName1Index, rowIndex, false);
            }
            String realmGet$lastName2 = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$lastName2();
            if (realmGet$lastName2 != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastName2Index, rowIndex, realmGet$lastName2, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastName2Index, rowIndex, false);
            }
            String realmGet$birthday = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$birthday();
            if (realmGet$birthday != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.birthdayIndex, rowIndex, realmGet$birthday, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.birthdayIndex, rowIndex, false);
            }
            String realmGet$phone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneIndex, rowIndex, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneIndex, rowIndex, false);
            }
            String realmGet$email = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$email();
            if (realmGet$email != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emailIndex, rowIndex, realmGet$email, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emailIndex, rowIndex, false);
            }
            String realmGet$address = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressIndex, rowIndex, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressIndex, rowIndex, false);
            }
            String realmGet$area = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$area();
            if (realmGet$area != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.areaIndex, rowIndex, realmGet$area, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.areaIndex, rowIndex, false);
            }
            String realmGet$job = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$job();
            if (realmGet$job != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jobIndex, rowIndex, realmGet$job, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jobIndex, rowIndex, false);
            }
            String realmGet$state = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$state();
            if (realmGet$state != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.stateIndex, rowIndex, realmGet$state, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.stateIndex, rowIndex, false);
            }
            String realmGet$nss = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nss();
            if (realmGet$nss != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nssIndex, rowIndex, realmGet$nss, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nssIndex, rowIndex, false);
            }
            String realmGet$diseases = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$diseases();
            if (realmGet$diseases != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.diseasesIndex, rowIndex, realmGet$diseases, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.diseasesIndex, rowIndex, false);
            }
            String realmGet$photoURL = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$photoURL();
            if (realmGet$photoURL != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoURLIndex, rowIndex, realmGet$photoURL, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoURLIndex, rowIndex, false);
            }
            String realmGet$scholarship = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$scholarship();
            if (realmGet$scholarship != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, realmGet$scholarship, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.scholarshipIndex, rowIndex, false);
            }
            String realmGet$nationality = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$nationality();
            if (realmGet$nationality != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nationalityIndex, rowIndex, realmGet$nationality, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nationalityIndex, rowIndex, false);
            }
            String realmGet$status = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$emergencyContactName = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactName();
            if (realmGet$emergencyContactName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, realmGet$emergencyContactName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emergencyContactNameIndex, rowIndex, false);
            }
            String realmGet$emergencyContactPhone = ((itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) object).realmGet$emergencyContactPhone();
            if (realmGet$emergencyContactPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, realmGet$emergencyContactPhone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.emergencyContactPhoneIndex, rowIndex, false);
            }
        }
    }

    public static itlapps.juanjoseesva.contacts.model.Contact createDetachedCopy(itlapps.juanjoseesva.contacts.model.Contact realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        itlapps.juanjoseesva.contacts.model.Contact unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new itlapps.juanjoseesva.contacts.model.Contact();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (itlapps.juanjoseesva.contacts.model.Contact) cachedObject.object;
            }
            unmanagedObject = (itlapps.juanjoseesva.contacts.model.Contact) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface unmanagedCopy = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) unmanagedObject;
        itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface realmSource = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$paysheet(realmSource.realmGet$paysheet());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$lastName1(realmSource.realmGet$lastName1());
        unmanagedCopy.realmSet$lastName2(realmSource.realmGet$lastName2());
        unmanagedCopy.realmSet$birthday(realmSource.realmGet$birthday());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());
        unmanagedCopy.realmSet$email(realmSource.realmGet$email());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$area(realmSource.realmGet$area());
        unmanagedCopy.realmSet$job(realmSource.realmGet$job());
        unmanagedCopy.realmSet$state(realmSource.realmGet$state());
        unmanagedCopy.realmSet$nss(realmSource.realmGet$nss());
        unmanagedCopy.realmSet$diseases(realmSource.realmGet$diseases());
        unmanagedCopy.realmSet$photoURL(realmSource.realmGet$photoURL());
        unmanagedCopy.realmSet$scholarship(realmSource.realmGet$scholarship());
        unmanagedCopy.realmSet$nationality(realmSource.realmGet$nationality());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$emergencyContactName(realmSource.realmGet$emergencyContactName());
        unmanagedCopy.realmSet$emergencyContactPhone(realmSource.realmGet$emergencyContactPhone());

        return unmanagedObject;
    }

    static itlapps.juanjoseesva.contacts.model.Contact update(Realm realm, ContactColumnInfo columnInfo, itlapps.juanjoseesva.contacts.model.Contact realmObject, itlapps.juanjoseesva.contacts.model.Contact newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface realmObjectTarget = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) realmObject;
        itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface realmObjectSource = (itlapps_juanjoseesva_contacts_model_ContactRealmProxyInterface) newObject;
        Table table = realm.getTable(itlapps.juanjoseesva.contacts.model.Contact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);
        builder.addString(columnInfo.paysheetIndex, realmObjectSource.realmGet$paysheet());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.lastName1Index, realmObjectSource.realmGet$lastName1());
        builder.addString(columnInfo.lastName2Index, realmObjectSource.realmGet$lastName2());
        builder.addString(columnInfo.birthdayIndex, realmObjectSource.realmGet$birthday());
        builder.addString(columnInfo.phoneIndex, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.emailIndex, realmObjectSource.realmGet$email());
        builder.addString(columnInfo.addressIndex, realmObjectSource.realmGet$address());
        builder.addString(columnInfo.areaIndex, realmObjectSource.realmGet$area());
        builder.addString(columnInfo.jobIndex, realmObjectSource.realmGet$job());
        builder.addString(columnInfo.stateIndex, realmObjectSource.realmGet$state());
        builder.addString(columnInfo.nssIndex, realmObjectSource.realmGet$nss());
        builder.addString(columnInfo.diseasesIndex, realmObjectSource.realmGet$diseases());
        builder.addString(columnInfo.photoURLIndex, realmObjectSource.realmGet$photoURL());
        builder.addString(columnInfo.scholarshipIndex, realmObjectSource.realmGet$scholarship());
        builder.addString(columnInfo.nationalityIndex, realmObjectSource.realmGet$nationality());
        builder.addString(columnInfo.statusIndex, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.emergencyContactNameIndex, realmObjectSource.realmGet$emergencyContactName());
        builder.addString(columnInfo.emergencyContactPhoneIndex, realmObjectSource.realmGet$emergencyContactPhone());

        builder.updateExistingObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Contact = proxy[");
        stringBuilder.append("{paysheet:");
        stringBuilder.append(realmGet$paysheet());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastName1:");
        stringBuilder.append(realmGet$lastName1());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastName2:");
        stringBuilder.append(realmGet$lastName2());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{birthday:");
        stringBuilder.append(realmGet$birthday());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{phone:");
        stringBuilder.append(realmGet$phone());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{email:");
        stringBuilder.append(realmGet$email());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{area:");
        stringBuilder.append(realmGet$area());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{job:");
        stringBuilder.append(realmGet$job());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{state:");
        stringBuilder.append(realmGet$state());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nss:");
        stringBuilder.append(realmGet$nss());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{diseases:");
        stringBuilder.append(realmGet$diseases());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{photoURL:");
        stringBuilder.append(realmGet$photoURL());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{scholarship:");
        stringBuilder.append(realmGet$scholarship());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nationality:");
        stringBuilder.append(realmGet$nationality());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{emergencyContactName:");
        stringBuilder.append(realmGet$emergencyContactName());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{emergencyContactPhone:");
        stringBuilder.append(realmGet$emergencyContactPhone());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        itlapps_juanjoseesva_contacts_model_ContactRealmProxy aContact = (itlapps_juanjoseesva_contacts_model_ContactRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aContact.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aContact.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aContact.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
