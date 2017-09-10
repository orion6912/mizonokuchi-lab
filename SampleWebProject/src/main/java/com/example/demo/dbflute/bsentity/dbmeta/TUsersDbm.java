package com.example.demo.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.example.demo.dbflute.allcommon.*;
import com.example.demo.dbflute.exentity.*;

/**
 * The DB meta of t_users. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class TUsersDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final TUsersDbm _instance = new TUsersDbm();
    private TUsersDbm() {}
    public static TUsersDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((TUsers)et).getId(), (et, vl) -> ((TUsers)et).setId(cti(vl)), "id");
        setupEpg(_epgMap, et -> ((TUsers)et).getUserId(), (et, vl) -> ((TUsers)et).setUserId((String)vl), "userId");
        setupEpg(_epgMap, et -> ((TUsers)et).getPassword(), (et, vl) -> ((TUsers)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((TUsers)et).getIsActive(), (et, vl) -> ((TUsers)et).setIsActive((Boolean)vl), "isActive");
        setupEpg(_epgMap, et -> ((TUsers)et).getCreateDate(), (et, vl) -> ((TUsers)et).setCreateDate(ctldt(vl)), "createDate");
        setupEpg(_epgMap, et -> ((TUsers)et).getUpdateDate(), (et, vl) -> ((TUsers)et).setUpdateDate(ctldt(vl)), "updateDate");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "t_users";
    protected final String _tableDispName = "t_users";
    protected final String _tablePropertyName = "TUsers";
    protected final TableSqlName _tableSqlName = new TableSqlName("t_users", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("id", "id", null, null, Integer.class, "id", null, true, true, true, "serial", 10, 0, null, "nextval('t_users_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, String.class, "userId", null, false, false, true, "bpchar", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("password", "password", null, null, String.class, "password", null, false, false, true, "bpchar", 100, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIsActive = cci("is_active", "is_active", null, null, Boolean.class, "isActive", null, false, false, false, "bool", 1, 0, null, "true", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCreateDate = cci("create_date", "create_date", null, null, java.time.LocalDateTime.class, "createDate", null, false, false, false, "timestamp", 29, 6, null, "now()", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDate = cci("update_date", "update_date", null, null, java.time.LocalDateTime.class, "updateDate", null, false, false, false, "timestamp", 29, 6, null, null, false, null, null, null, null, null, false);

    /**
     * id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnId() { return _columnId; }
    /**
     * user_id: {NotNull, bpchar(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * password: {NotNull, bpchar(100)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * is_active: {bool(1), default=[true]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIsActive() { return _columnIsActive; }
    /**
     * create_date: {timestamp(29, 6), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCreateDate() { return _columnCreateDate; }
    /**
     * update_date: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDate() { return _columnUpdateDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnUserId());
        ls.add(columnPassword());
        ls.add(columnIsActive());
        ls.add(columnCreateDate());
        ls.add(columnUpdateDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "t_users_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.demo.dbflute.exentity.TUsers"; }
    public String getConditionBeanTypeName() { return "com.example.demo.dbflute.cbean.TUsersCB"; }
    public String getBehaviorTypeName() { return "com.example.demo.dbflute.exbhv.TUsersBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<TUsers> getEntityType() { return TUsers.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public TUsers newEntity() { return new TUsers(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((TUsers)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((TUsers)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
