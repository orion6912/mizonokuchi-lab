/*
 [df:title]
  SQL title here.

 [df:description]
  SQL Description here.

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select user_id, password
  from t_users
 /*BEGIN*/
   /*IF pmb.user_id != null*/
 where user_id =/*pmb.user_id*/'test'
  /*END*/

 /*END*/
