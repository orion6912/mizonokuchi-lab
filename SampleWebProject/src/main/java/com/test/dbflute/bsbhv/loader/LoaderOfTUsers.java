package com.test.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.test.dbflute.exbhv.*;
import com.test.dbflute.exentity.*;

/**
 * The referrer loader of t_users as TABLE. <br>
 * <pre>
 * [primary key]
 *     id
 *
 * [column]
 *     id, user_id, password, is_active, create_date, update_date
 *
 * [sequence]
 *     t_users_id_seq
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTUsers {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TUsers> _selectedList;
    protected BehaviorSelector _selector;
    protected TUsersBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTUsers ready(List<TUsers> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TUsersBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TUsersBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TUsers> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
