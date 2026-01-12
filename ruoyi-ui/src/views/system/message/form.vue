<template>
  <div class="app-container">
    <el-form :model="form" label-width="80px">
      <el-form-item label="姓名" prop="visitorName">
        <el-input v-model="form.visitorName"></el-input>
      </el-form-item>
      <el-form-item label="邮箱" prop="visitorEmail">
        <el-input v-model="form.visitorEmail"></el-input>
      </el-form-item>
      <el-form-item label="留言内容" prop="content">
        <el-input type="textarea" v-model="form.content" rows="4"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm">提交留言</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import { addMessage } from '@/api/system/message'
export default {
  data() {
    return {
      form: {
        visitorName: '',
        visitorEmail: '',
        content: ''
      }
    }
  },
  methods: {
    submitForm() {
      addMessage(this.form).then(response => {
        if (response.code === 200) {
          this.$message.success('留言提交成功')
          this.$router.push({ path: '/system/message' })
        } else {
          this.$message.error(response.msg)
        }
      })
    }
  }
}
</script>
