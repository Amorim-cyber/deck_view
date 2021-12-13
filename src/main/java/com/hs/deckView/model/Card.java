package com.hs.deckView.model;

import javax.persistence.*;

@Entity
@Table(name = "t_local")
public class Card {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "type")
        private String type;

        @Column(name= "school")
        private String school;

        @Column(name="rarity")
        private String rarity;

        @Column(name="minion")
        private String minion;

        @Column(name="set")
        private String set;

        @Column(name="class")
        private String clas;

        @Column(name="dust_creation")
        private String dustCreation;

        @Column(name="dust_destruction")
        private String dustDestruction;

        @Column(name="artist")
        private String artist;

        @Column(name="mana")
        private String mana;

        @Column(name="attack")
        private String attack;

        @Column(name="health")
        private String health;

        @Column(name="key_word")
        private String keyWord;

        @Column(name="description")
        private String description;

        @Column(name="effect")
        private String effect;

        @Column(name="crop_image")
        private String cropImage;

        @Column(name="image")
        private String image;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getSchool() {
                return school;
        }

        public void setSchool(String school) {
                this.school = school;
        }

        public String getRarity() {
                return rarity;
        }

        public void setRarity(String rarity) {
                this.rarity = rarity;
        }

        public String getMinion() {
                return minion;
        }

        public void setMinion(String minion) {
                this.minion = minion;
        }

        public String getSet() {
                return set;
        }

        public void setSet(String set) {
                this.set = set;
        }

        public String getClas() {
                return clas;
        }

        public void setClas(String clas) {
                this.clas = clas;
        }

        public String getDustCreation() {
                return dustCreation;
        }

        public void setDustCreation(String dustCreation) {
                this.dustCreation = dustCreation;
        }

        public String getDustDestruction() {
                return dustDestruction;
        }

        public void setDustDestruction(String dustDestruction) {
                this.dustDestruction = dustDestruction;
        }

        public String getArtist() {
                return artist;
        }

        public void setArtist(String artist) {
                this.artist = artist;
        }

        public String getMana() {
                return mana;
        }

        public void setMana(String mana) {
                this.mana = mana;
        }

        public String getAttack() {
                return attack;
        }

        public void setAttack(String attack) {
                this.attack = attack;
        }

        public String getHealth() {
                return health;
        }

        public void setHealth(String health) {
                this.health = health;
        }

        public String getKeyWord() {
                return keyWord;
        }

        public void setKeyWord(String keyWord) {
                this.keyWord = keyWord;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getEffect() {
                return effect;
        }

        public void setEffect(String effect) {
                this.effect = effect;
        }

        public String getCropImage() {
                return cropImage;
        }

        public void setCropImage(String cropImage) {
                this.cropImage = cropImage;
        }

        public String getImage() {
                return image;
        }

        public void setImage(String image) {
                this.image = image;
        }
}
