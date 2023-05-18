package com.berkOs.Hafta04.gun2.soyutlama;

public class Post {

		int id;
		String icerik;
		String resimUrl;
		int UserId;
		
		public Post() {
			
		}
		
		
		public Post(int id,String icerik) {
			this.id=id;
			this.icerik=icerik;
		}
		public Post(int id,String icerik, int userId) {
			this.id=id;
			this.icerik=icerik;
			this.UserId=userId;
		}
		public Post(int id,String icerik, int userId,String resimUrl) {
			this(id,icerik,userId);
			this.resimUrl=resimUrl;
		}
}
