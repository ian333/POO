function Car(license,driver){

    this.id;
    this.license=license;
    this.driver=driver;
    this.passengers;
}



Car.prototype.printDatacar= function(){

        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)

}