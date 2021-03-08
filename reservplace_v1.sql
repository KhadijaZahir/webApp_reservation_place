PGDMP     9    6                y           Reservation_Place    13.2    13.2 )    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    18541    Reservation_Place    DATABASE     p   CREATE DATABASE "Reservation_Place" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'French_Morocco.1252';
 #   DROP DATABASE "Reservation_Place";
                postgres    false            �            1259    19283    administateur    TABLE     :   CREATE TABLE public.administateur (
    id_user bigint
);
 !   DROP TABLE public.administateur;
       public         heap    postgres    false            �            1259    19275 	   apprenant    TABLE     ]   CREATE TABLE public.apprenant (
    id_user bigint,
    reservationnbmax integer NOT NULL
);
    DROP TABLE public.apprenant;
       public         heap    postgres    false            �            1259    19301    reservation    TABLE     �   CREATE TABLE public.reservation (
    id_reservation bigint NOT NULL,
    id_user bigint,
    id_typereseervtaion bigint,
    confirmerreservation boolean NOT NULL,
    datereservation timestamp without time zone NOT NULL
);
    DROP TABLE public.reservation;
       public         heap    postgres    false            �            1259    19299    reservation_id_reservation_seq    SEQUENCE     �   CREATE SEQUENCE public.reservation_id_reservation_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 5   DROP SEQUENCE public.reservation_id_reservation_seq;
       public          postgres    false    209            �           0    0    reservation_id_reservation_seq    SEQUENCE OWNED BY     a   ALTER SEQUENCE public.reservation_id_reservation_seq OWNED BY public.reservation.id_reservation;
          public          postgres    false    208            �            1259    19256    roles    TABLE     k   CREATE TABLE public.roles (
    id_role integer NOT NULL,
    role_name character varying(255) NOT NULL
);
    DROP TABLE public.roles;
       public         heap    postgres    false            �            1259    19254    roles_id_role_seq    SEQUENCE     �   CREATE SEQUENCE public.roles_id_role_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.roles_id_role_seq;
       public          postgres    false    201            �           0    0    roles_id_role_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.roles_id_role_seq OWNED BY public.roles.id_role;
          public          postgres    false    200            �            1259    19293    typereservation    TABLE     �   CREATE TABLE public.typereservation (
    id_typereseervtaion integer NOT NULL,
    nom character varying(100) NOT NULL,
    nbapprenant integer NOT NULL,
    datenbplace timestamp without time zone NOT NULL
);
 #   DROP TABLE public.typereservation;
       public         heap    postgres    false            �            1259    19291 '   typereservation_id_typereseervtaion_seq    SEQUENCE     �   CREATE SEQUENCE public.typereservation_id_typereseervtaion_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 >   DROP SEQUENCE public.typereservation_id_typereseervtaion_seq;
       public          postgres    false    207            �           0    0 '   typereservation_id_typereseervtaion_seq    SEQUENCE OWNED BY     s   ALTER SEQUENCE public.typereservation_id_typereseervtaion_seq OWNED BY public.typereservation.id_typereseervtaion;
          public          postgres    false    206            �            1259    19264    utilisateur    TABLE       CREATE TABLE public.utilisateur (
    id_user bigint NOT NULL,
    id_role bigint,
    nom character varying(100) NOT NULL,
    prenom character varying(100) NOT NULL,
    email character varying(100) NOT NULL,
    password character varying(50) NOT NULL,
    phone integer NOT NULL
);
    DROP TABLE public.utilisateur;
       public         heap    postgres    false            �            1259    19262    utilisateur_id_user_seq    SEQUENCE     �   CREATE SEQUENCE public.utilisateur_id_user_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.utilisateur_id_user_seq;
       public          postgres    false    203            �           0    0    utilisateur_id_user_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.utilisateur_id_user_seq OWNED BY public.utilisateur.id_user;
          public          postgres    false    202            ?           2604    19304    reservation id_reservation    DEFAULT     �   ALTER TABLE ONLY public.reservation ALTER COLUMN id_reservation SET DEFAULT nextval('public.reservation_id_reservation_seq'::regclass);
 I   ALTER TABLE public.reservation ALTER COLUMN id_reservation DROP DEFAULT;
       public          postgres    false    208    209    209            <           2604    19259    roles id_role    DEFAULT     n   ALTER TABLE ONLY public.roles ALTER COLUMN id_role SET DEFAULT nextval('public.roles_id_role_seq'::regclass);
 <   ALTER TABLE public.roles ALTER COLUMN id_role DROP DEFAULT;
       public          postgres    false    201    200    201            >           2604    19296 #   typereservation id_typereseervtaion    DEFAULT     �   ALTER TABLE ONLY public.typereservation ALTER COLUMN id_typereseervtaion SET DEFAULT nextval('public.typereservation_id_typereseervtaion_seq'::regclass);
 R   ALTER TABLE public.typereservation ALTER COLUMN id_typereseervtaion DROP DEFAULT;
       public          postgres    false    207    206    207            =           2604    19267    utilisateur id_user    DEFAULT     z   ALTER TABLE ONLY public.utilisateur ALTER COLUMN id_user SET DEFAULT nextval('public.utilisateur_id_user_seq'::regclass);
 B   ALTER TABLE public.utilisateur ALTER COLUMN id_user DROP DEFAULT;
       public          postgres    false    202    203    203            �          0    19283    administateur 
   TABLE DATA           0   COPY public.administateur (id_user) FROM stdin;
    public          postgres    false    205   �0       �          0    19275 	   apprenant 
   TABLE DATA           >   COPY public.apprenant (id_user, reservationnbmax) FROM stdin;
    public          postgres    false    204   �0       �          0    19301    reservation 
   TABLE DATA           z   COPY public.reservation (id_reservation, id_user, id_typereseervtaion, confirmerreservation, datereservation) FROM stdin;
    public          postgres    false    209   �0       �          0    19256    roles 
   TABLE DATA           3   COPY public.roles (id_role, role_name) FROM stdin;
    public          postgres    false    201   �0       �          0    19293    typereservation 
   TABLE DATA           ]   COPY public.typereservation (id_typereseervtaion, nom, nbapprenant, datenbplace) FROM stdin;
    public          postgres    false    207   �0       �          0    19264    utilisateur 
   TABLE DATA           \   COPY public.utilisateur (id_user, id_role, nom, prenom, email, password, phone) FROM stdin;
    public          postgres    false    203   1       �           0    0    reservation_id_reservation_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.reservation_id_reservation_seq', 1, false);
          public          postgres    false    208            �           0    0    roles_id_role_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.roles_id_role_seq', 1, false);
          public          postgres    false    200            �           0    0 '   typereservation_id_typereseervtaion_seq    SEQUENCE SET     V   SELECT pg_catalog.setval('public.typereservation_id_typereseervtaion_seq', 1, false);
          public          postgres    false    206            �           0    0    utilisateur_id_user_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.utilisateur_id_user_seq', 1, false);
          public          postgres    false    202            G           2606    19306    reservation reservation_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_pkey PRIMARY KEY (id_reservation);
 F   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_pkey;
       public            postgres    false    209            A           2606    19261    roles roles_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.roles
    ADD CONSTRAINT roles_pkey PRIMARY KEY (id_role);
 :   ALTER TABLE ONLY public.roles DROP CONSTRAINT roles_pkey;
       public            postgres    false    201            E           2606    19298 $   typereservation typereservation_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.typereservation
    ADD CONSTRAINT typereservation_pkey PRIMARY KEY (id_typereseervtaion);
 N   ALTER TABLE ONLY public.typereservation DROP CONSTRAINT typereservation_pkey;
       public            postgres    false    207            C           2606    19269    utilisateur utilisateur_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.utilisateur
    ADD CONSTRAINT utilisateur_pkey PRIMARY KEY (id_user);
 F   ALTER TABLE ONLY public.utilisateur DROP CONSTRAINT utilisateur_pkey;
       public            postgres    false    203            J           2606    19286 (   administateur administateur_id_user_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.administateur
    ADD CONSTRAINT administateur_id_user_fkey FOREIGN KEY (id_user) REFERENCES public.utilisateur(id_user);
 R   ALTER TABLE ONLY public.administateur DROP CONSTRAINT administateur_id_user_fkey;
       public          postgres    false    205    2883    203            I           2606    19278     apprenant apprenant_id_user_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.apprenant
    ADD CONSTRAINT apprenant_id_user_fkey FOREIGN KEY (id_user) REFERENCES public.utilisateur(id_user);
 J   ALTER TABLE ONLY public.apprenant DROP CONSTRAINT apprenant_id_user_fkey;
       public          postgres    false    2883    203    204            L           2606    19312 0   reservation reservation_id_typereseervtaion_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_id_typereseervtaion_fkey FOREIGN KEY (id_typereseervtaion) REFERENCES public.typereservation(id_typereseervtaion);
 Z   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_id_typereseervtaion_fkey;
       public          postgres    false    2885    209    207            K           2606    19307 $   reservation reservation_id_user_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_id_user_fkey FOREIGN KEY (id_user) REFERENCES public.utilisateur(id_user);
 N   ALTER TABLE ONLY public.reservation DROP CONSTRAINT reservation_id_user_fkey;
       public          postgres    false    2883    209    203            H           2606    19270 $   utilisateur utilisateur_id_role_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.utilisateur
    ADD CONSTRAINT utilisateur_id_role_fkey FOREIGN KEY (id_role) REFERENCES public.roles(id_role);
 N   ALTER TABLE ONLY public.utilisateur DROP CONSTRAINT utilisateur_id_role_fkey;
       public          postgres    false    2881    203    201            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     