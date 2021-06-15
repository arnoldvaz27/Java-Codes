class subarray{
	public static void main(String[] args) {
		int arr[] = {2,3,9,4,3,2};
		boolean sub = false;

		for(int i = 0; i<arr.length;i++){
			int sum = 0;
			for(int j = 0;j<arr.length;j++){
				sum+=arr[j];
				if(sum==0){
					sub = true;
					break;
				}
				if(sub) {
					break;
				}
			}
		}

			System.out.println("Sub array found: "+sub);
	}
}