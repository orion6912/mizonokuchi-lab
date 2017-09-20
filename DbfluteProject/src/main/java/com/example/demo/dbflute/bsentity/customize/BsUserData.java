package com.example.demo.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.example.demo.dbflute.exentity.customize.*;

/**
 * The entity of UserData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     user_id, password
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String userId = entity.getUserId();
 * String password = entity.getPassword();
 * entity.setUserId(userId);
 * entity.setPassword(password);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserData extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {bpchar(50), refers to t_users.user_id} */
    protected String _userId;

    /** password: {bpchar(100), refers to t_users.password} */
    protected String _password;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.example.demo.dbflute.bsentity.customize.dbmeta.UserDataDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "UserData";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserData) {
            BsUserData other = (BsUserData)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            if (!xSV(_password, other._password)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        hs = xCH(hs, _password);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_password));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public UserData clone() {
        return (UserData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {bpchar(50), refers to t_users.user_id} <br>
     * @return The value of the column 'user_id'. (NullAllowed even if selected: for no constraint)
     */
    public String getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {bpchar(50), refers to t_users.user_id} <br>
     * @param userId The value of the column 'user_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUserId(String userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] password: {bpchar(100), refers to t_users.password} <br>
     * @return The value of the column 'password'. (NullAllowed even if selected: for no constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] password: {bpchar(100), refers to t_users.password} <br>
     * @param password The value of the column 'password'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }
}
