<template>
  <div>
    <el-tabs v-model="activeName" type="card">
      <el-tab-pane label="部门管理" name="depmana"><DepMana></DepMana></el-tab-pane>
      <el-tab-pane label="职位管理" name="posmana"><PosMana></PosMana></el-tab-pane>
      <el-tab-pane label="职称管理" name="joblevelmana"><JobLevelMana></JobLevelMana></el-tab-pane>
      <el-tab-pane label="奖惩管理" name="ecmana"><EcMana></EcMana></el-tab-pane>
      <el-tab-pane label="权限组" name="permissionmana"><PermissionMana></PermissionMana></el-tab-pane>
    </el-tabs>
  </div>
</template>

<script>
import DepMana from "@/components/sys/basic/DepMana";
import PosMana from "@/components/sys/basic/PosMana";
import JobLevelMana from "@/components/sys/basic/JobLevelMana";
import PermissionMana from "@/components/sys/basic/PermissionMana";
import EcMana from "@/components/sys/basic/EcMana";
export default {
  name: "SysBasic",
  data(){
    return{
      activeName:'depmana'
    }
  },
  components:{
    DepMana,
    PosMana,
    JobLevelMana,
    EcMana,
    PermissionMana
  }
}
</script>

<style scoped>

</style>