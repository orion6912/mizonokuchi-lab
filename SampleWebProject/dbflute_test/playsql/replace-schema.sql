CREATE TABLE public.t_users (
  id SERIAL,
  user_id CHAR(50) NOT NULL,
  password CHAR(100) NOT NULL,
  is_active BOOLEAN DEFAULT true,
  create_date TIMESTAMP WITHOUT TIME ZONE DEFAULT now(),
  update_date TIMESTAMP WITHOUT TIME ZONE,
  CONSTRAINT t_users_pkey PRIMARY KEY(id)
) 
WITH (oids = false);