package com.seekar.dagger_hilt_concept.interface_thirdparty_binding_issue_resolved

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

//Working scenario
/*
class SomeClass
@Inject
constructor(private val printData:PrintData){
    fun getMyData():String{
        return printData.getPrintableData()
    }
}


class PrintData //Some dependency class for print
@Inject
constructor()  {
    fun getPrintableData(): String {
        return "PRATIM n AK"
    }
}
*/



//Issue with interface
class SomeClass
@Inject
constructor(private val iPrint:IPrint, private  val gson: Gson){
    fun getMyData():String{
        return iPrint.getPrintableData()
    }
}


class PrintData //Some dependency class for print
@Inject
constructor() :IPrint {
    override fun getPrintableData(): String {
        return "PRATIM n AK"
    }
}



interface IPrint{
    fun getPrintableData(): String
}




//Solution one -> complicated, not suitable for third party library
/*
@InstallIn(ActivityComponent::class)
@Module
abstract class Mymodule{
    @ActivityScoped
    @Binds
    abstract fun bindDependency(
        printData:PrintData
    ):IPrint
}
*/


//solution two -> Awesome
//see code in MyModule class



