package com.css.overload;



	public class Lion extends Animals{
		
		private String lion1;
		private String lion2;
		/**
		 * @return the lion1
		 */
		public String getLion1() {
			return lion1;
		}
		/**
		 * @param lion1 the lion1 to set
		 */
		public void setLion1(String lion1) {
			this.lion1 = lion1;
		}
		/**
		 * @return the lion2
		 */
		public String getLion2() {
			return lion2;
		}
		/**
		 * @param lion2 the lion2 to set
		 */
		public void setLion2(String lion2) {
			this.lion2 = lion2;
		}
		public Lion() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Lion(String animal1, String animal2, String lion1, String lion2) {
			super(animal1, animal2);
			this.lion1 = lion1;
			this.lion2 = lion2;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		
		
		@Override
		public String toString() {
			return super.toString()+"Lion [lion1=" + lion1 + ", lion2=" + lion2 + "]";
		}

	}


